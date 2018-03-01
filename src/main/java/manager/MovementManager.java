package manager;

import domain.Orientation;
import domain.Position;

public final class MovementManager {

    public static Position moveForward(final Orientation orientation, final Position position) {

        final Position nextPosition;

        switch (orientation) {
            case NORTH:
                nextPosition = new Position(position.getX(), position.getY() - 1);
                break;
            case SOUTH:
                nextPosition = new Position(position.getX(), position.getY() + 1);
                break;
            case EST:
                nextPosition = new Position(position.getX() + 1, position.getY());
                break;
            case WEST:
                nextPosition = new Position(position.getX() - 1, position.getY());
                break;
            default:
                nextPosition = new Position(position.getX(), position.getY());
                break;
        }
        return nextPosition;
    }

    public static Orientation moveRight(final Orientation orientation) {
        final Orientation nextOrientation;

        switch (orientation) {
            case NORTH:
                nextOrientation = Orientation.EST;
                break;
            case SOUTH:
                nextOrientation = Orientation.WEST;
                break;
            case EST:
                nextOrientation = Orientation.SOUTH;
                break;
            case WEST:
                nextOrientation = Orientation.NORTH;
                break;
            default:
                nextOrientation = orientation;
                break;
        }

        return nextOrientation;
    }

    public static Orientation moveLeft(final Orientation orientation) {

        final Orientation nextOrientation;

        switch (orientation) {
            case NORTH:
                nextOrientation = Orientation.WEST;
                break;
            case SOUTH:
                nextOrientation = Orientation.EST;
                break;
            case EST:
                nextOrientation = Orientation.NORTH;
                break;
            case WEST:
                nextOrientation = Orientation.SOUTH;
                break;
            default:
                nextOrientation = orientation;
                break;
        }

        return nextOrientation;
    }

    private MovementManager() {
        // NOP
    }
}
