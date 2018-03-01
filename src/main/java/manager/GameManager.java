package manager;

import Factory.AdventurersFactory;
import Factory.CasesFactory;
import domain.*;

import java.util.Collection;
import java.util.List;

public class GameManager {

    private final TreasureMap treasureMap;
    private final Collection<Adventurer> adventurers;

    public GameManager() {
        final List<String> lines = FileManager.readFile();

        adventurers = AdventurersFactory.createAdventurers(lines, " - ");

        treasureMap = CasesFactory.createMap(lines);

        CasesFactory.createCases(lines, " - ").forEach(treasureMap::addObject);
    }

    public void readSequence() {
        for (final Adventurer adventurer : adventurers) {

            isTreasure(adventurer.getPosition());

            for (int i = 0; i < adventurer.getSequence().length; i++) {

                final Position futurePosition = MovementManager.moveForward(adventurer.getOrientation(),
                        adventurer.getPosition());

                switch (adventurer.getSequence()[i]) {
                    case MOVE_FORWARD:
                        if (isMovable(futurePosition)) {
                            final Position position = MovementManager.moveForward(adventurer.getOrientation(),
                                    adventurer.getPosition());
                            adventurer.setPosition(position);
                            isTreasure(adventurer.getPosition());
                        }
                        break;
                    case MOVE_LEFT:
                        final Orientation left = MovementManager.moveLeft(adventurer.getOrientation());
                        adventurer.setPosition(left);
                        break;
                    case MOVE_RIGHT:
                        final Orientation orientation = MovementManager.moveRight(adventurer.getOrientation());
                        adventurer.setPosition(orientation);
                        break;
                    default:
                        break;
                }
            }
        }
        ObjectsManager.writeInFile(treasureMap, adventurers);
    }

    private void isTreasure(final Position position) {
        if (treasureMap.getCase(position.getX(), position.getY()) instanceof Treasure && position instanceof Adventurer) {
            //Si il est sur une case tresor, on le prend
            ((Treasure) treasureMap.getCase(position.getX(), position.getY())).pickupTreasure();
            //Et on incremente son compteur de tresor ramassé
            ((Adventurer) position).addTreasure();
        }
    }

    private boolean isMovable(final Position position) {
        return position.getX() >= 0 && position.getY() >= 0 &&
                position.getX() < treasureMap.getWidth() &&
                position.getY() < treasureMap.getLength() &&
                treasureMap.getCase(position.getX(), position.getY()).isPassable() &&
                !adventurers.contains(position);
    }
}
