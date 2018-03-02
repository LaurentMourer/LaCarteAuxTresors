package com.laurent.manager;

import com.laurent.domain.*;
import com.laurent.factory.AdventurersFactory;
import com.laurent.factory.CasesFactory;
import com.laurent.factory.TreasureMapFactory;

import java.util.List;

import static com.laurent.manager.MovementManager.moveLeft;
import static com.laurent.manager.MovementManager.moveRight;

public final class GameManager {

    public static void LaunchGame() {
        final List<String> lines = FileManager.readFile();

        final String delimiter = " - ";

        final List<Adventurer> adventurers = AdventurersFactory.createAdventurers(lines, delimiter);

        final List<TreasureMap> treasureMaps = TreasureMapFactory.createMap(lines, delimiter);

        final TreasureMap treasureMap = treasureMaps.get(0);

        final List<Case> cases = CasesFactory.createCases(lines, delimiter);

        cases.forEach(treasureMap::addObject);

        readSequence(treasureMap, adventurers);
    }

    private static void readSequence(final TreasureMap treasureMap, final List<Adventurer> adventurers) {
        for (final Adventurer adventurer : adventurers) {

            final Position currentPosition = adventurer.getPositions().get(adventurer.getPositions().size() - 1);

            pickUpIfExistTreasure(treasureMap, adventurer);


            for (int i = 0; i < adventurer.getMovements().size(); i++) {
                final Orientation currentOrientation = adventurer.getOrientations().get(adventurer.getOrientations().size() - 1);
                final Position futurePosition = MovementManager.moveForward(currentOrientation, currentPosition);

                switch (adventurer.getMovements().get(i)) {
                    case A:
                        if (isMovable(treasureMap, adventurers, futurePosition)) {
                            moveForward(adventurer, currentPosition, currentOrientation);
                            pickUpIfExistTreasure(treasureMap, adventurer);
                        }
                        break;
                    case G:
                        adventurer.addOrientation(moveLeft(currentOrientation));
                        break;
                    case D:
                        adventurer.addOrientation(moveRight(currentOrientation));
                        break;
                    default:
                        break;
                }
            }
        }
        FileHelper.writeInFile(treasureMap, adventurers);
    }

    private static void moveForward(final Adventurer adventurer, final Position currentPosition, final Orientation currentOrientation) {
        final Position position = MovementManager.moveForward(currentOrientation,
                currentPosition);

        adventurer.addPosition(position);
    }

    private static void pickUpIfExistTreasure(final TreasureMap treasureMap, final Adventurer adventurer) {
        final Position position = adventurer.getPositions().get(adventurer.getPositions().size() - 1);
        if (treasureMap.getCase(position.getX(), position.getY()) instanceof Treasures) {
            final Treasures treasures = (Treasures) treasureMap.getCase(position.getX(), position.getY());

            treasures.removeTreasure();
            adventurer.addTreasure();
        }
    }

    private static boolean isMovable(final TreasureMap treasureMap, final List<Adventurer> adventurers, final Position position) {
        return position.getX() >= 0 && position.getY() >= 0 &&
                position.getX() < treasureMap.getWidth() &&
                position.getY() < treasureMap.getLength() &&
                treasureMap.getCase(position.getX(), position.getY()).isPassable() &&
                !adventurers.contains(position);
    }

    private GameManager() {
        // NOP
    }
}
