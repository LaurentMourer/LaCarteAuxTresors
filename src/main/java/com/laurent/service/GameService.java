package com.laurent.service;

import com.google.common.collect.Lists;
import com.laurent.domain.Adventurer;
import com.laurent.domain.Case;
import com.laurent.domain.Movement;
import com.laurent.domain.Orientation;
import com.laurent.domain.Position;
import com.laurent.domain.Treasure;
import com.laurent.domain.TreasureMap;
import com.laurent.domain.TypeCase;
import com.laurent.factory.AdventurersFactory;
import com.laurent.factory.MountainFactory;
import com.laurent.factory.MovementFactory;
import com.laurent.factory.TreasureFactory;
import com.laurent.factory.TreasureMapFactory;
import com.laurent.printer.AdventurerPrinter;
import com.laurent.printer.TreasureMapPrinter;
import com.laurent.repository.FileRepository;
import com.laurent.utils.LinesHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameService {

    private final FileRepository fileRepository;

    @Autowired
    public GameService(final FileRepository fileRepository)
    {
        this.fileRepository = fileRepository;
    }

    public void run()
    {
        final List<List<String>> lines = LinesHelper.getLines(fileRepository.getFile("input.txt"), " - ");

        final List<Adventurer> initialAdventurers = getAdventurers(lines);

        final TreasureMap treasureMap = getTreasureMap(lines);

        final List<Adventurer> finalAdventurers = readAdventurerSequence(treasureMap, initialAdventurers);

        final String treasureMapContent = TreasureMapPrinter.print(treasureMap);
        final String adventurerContent = AdventurerPrinter.print(finalAdventurers);

        final String content = treasureMapContent + "\n" + adventurerContent;

        fileRepository.writeFile(content, "output.txt");
    }

    private TreasureMap getTreasureMap(final List<List<String>> lines)
    {
        final List<TreasureMap> treasureMaps = Lists.newArrayList();
        final List<Case> cases = Lists.newArrayList();

        lines.forEach(line -> {
            if (!line.isEmpty()) {
                switch (TypeCase.valueOf(line.get(0))) {
                    case MAP:
                        treasureMaps.add(TreasureMapFactory.createMap(line));
                        break;
                    case TREASURE:
                        cases.add(TreasureFactory.createTreasure(line));
                        break;
                    case MOUNTAIN:
                        cases.add(MountainFactory.createMountain(line));
                        break;
                    default:
                        break;
                }
            }
        });

        final TreasureMap treasureMap;

        if (!treasureMaps.isEmpty()) {
            treasureMap = treasureMaps.get(0);
            cases.forEach(treasureMap::addObject);
        } else {
            treasureMap = null;
        }

        return treasureMap;
    }

    private List<Adventurer> getAdventurers(final List<List<String>> lines)
    {
        final List<Adventurer> adventurers = Lists.newArrayList();

        lines.forEach(line -> {
            if (!line.isEmpty()) {
                final String typeCase = line.get(0);

                if (TypeCase.valueOf(typeCase).equals(TypeCase.ADVENTURER)) {
                    adventurers.add(AdventurersFactory.createAdventurers(line));
                }
            }
        });

        return adventurers;
    }

    private List<Adventurer> readAdventurerSequence(final TreasureMap treasureMap, final List<Adventurer> adventurers)
    {
        for (final Adventurer adventurer : adventurers) {
            final Position currentPosition = adventurer.getPosition().get(adventurer.getPosition().size() - 1);
            final Orientation currentOrientation = adventurer.getOrientation().get(adventurer.getOrientation().size() - 1);
            final Position futurePosition = MovementFactory.moveForward(currentOrientation, currentPosition);

            pickUpIfExistTreasure(treasureMap, adventurer);

            for (final Movement movement : adventurer.getMovements()) {
                switch (movement) {
                    case MOVE_FORWARD:
                        if (isMovable(treasureMap, adventurers, futurePosition)) {
                            adventurer.getPosition().add(moveForward(currentPosition, currentOrientation));
                            pickUpIfExistTreasure(treasureMap, adventurer);
                        }
                        break;
                    case TURN_LEFT:
                        adventurer.getOrientation().add(MovementFactory.moveLeft(currentOrientation));
                        break;
                    case TURN_RIGHT:
                        adventurer.getOrientation().add(MovementFactory.moveRight(currentOrientation));
                        break;
                    default:
                        break;
                }
            }
        }
        return adventurers;
    }

    private static Position moveForward(final Position currentPosition, final Orientation currentOrientation)
    {
        return MovementFactory.moveForward(currentOrientation,
                                           currentPosition);
    }

    private static void pickUpIfExistTreasure(final TreasureMap treasureMap, final Adventurer adventurer)
    {
        final Position position = adventurer.getPosition().get(adventurer.getPosition().size() - 1);
        if (treasureMap.getCase(position.getX(), position.getY()) instanceof Treasure) {
            final Treasure treasure = (Treasure) treasureMap.getCase(position.getX(), position.getY());

            treasure.removeTreasure();
            adventurer.getCountTreasure().incrementAndGet();
        }
    }

    private static boolean isMovable(final TreasureMap treasureMap,
                                     final List<Adventurer> adventurers,
                                     final Position position)
    {
        return position.getX() >= 0 && position.getY() >= 0 &&
               position.getX() < treasureMap.getWidth() &&
               position.getY() < treasureMap.getLength() &&
               treasureMap.getCase(position.getX(), position.getY()).isPassable() &&
               !adventurers.contains(position);
        // TODO @lmourer fix is movable
    }
}
