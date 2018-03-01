package manager;

import domain.*;

import java.util.List;

public class GameManager {

    private final TreasureMap treasureMap;
    private final List<Adventurer> adventurers;
    private final ObjectsManager objectsManager;

    public GameManager() {
        final List<String> lines = FileManager.readFile();

        objectsManager = new ObjectsManager(lines, " - ");

        adventurers = objectsManager.getAdventurers();

        treasureMap = objectsManager.getTreasureMap();

        objectsManager.getCases().forEach(treasureMap::addObject);
    }

    public void readSequence() {
        for (final Adventurer adventurer : adventurers) {
            //Si l'aventurier spawn sur la meme case qu'un tresor, on le ramasse;

            isTresor(adventurer.getPosition());

            for (int i = 0; i < adventurer.getSequence().length; i++) {

                final Position futurePosition = MovementManager.avancer(adventurer.getOrientation(), adventurer.getPosition());

                switch (adventurer.getSequence()[i]) {
                    case 'A':
                        if (isDeplacable(futurePosition)) {
                            final Position avancer = MovementManager.avancer(adventurer.getOrientation(), adventurer.getPosition());
                            adventurer.setPosition(avancer);
                            isTresor(adventurer.getPosition());
                        }
                        break;
                    case 'G':
                        final Orientation left = MovementManager.left(adventurer.getOrientation());
                        adventurer.setPosition(left);
                        break;
                    case 'D':
                        final Orientation orientation = MovementManager.right(adventurer.getOrientation());
                        adventurer.setPosition(orientation);
                        break;
                    default:
                        break;
                }
            }
        }
        objectsManager.writeInFile(treasureMap);
    }

    private void isTresor(final Position position) {
        if (treasureMap.getCase(position.getX(), position.getY()) instanceof Treasure && position instanceof Adventurer) {
            //Si il est sur une case tresor, on le prend
            ((Treasure) treasureMap.getCase(position.getX(), position.getY())).pickupTreasure();
            //Et on incremente son compteur de tresor ramassé
            ((Adventurer) position).addTreasure();
        }
    }

    private boolean isDeplacable(final Position position) {
        return position.getX() >= 0 && position.getY() >= 0 &&
                position.getX() < treasureMap.getWidth() &&
                position.getY() < treasureMap.getLength() &&
                treasureMap.getCase(position.getX(), position.getY()).isPassable() &&
                !adventurers.contains(position);
    }
}
