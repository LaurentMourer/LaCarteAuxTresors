package com.laurent.factory;

import com.laurent.domain.Orientation;
import com.laurent.domain.Position;

public final class MovementFactory {

    private MovementFactory()
    {
        // NOP
    }

    public static Position moveForward(final Orientation orientation, final Position position)
    {

        final Position nextPosition;

        switch (orientation) {
            case N:
                nextPosition = new Position(position.getX(), position.getY() - 1);
                break;
            case S:
                nextPosition = new Position(position.getX(), position.getY() + 1);
                break;
            case E:
                nextPosition = new Position(position.getX() + 1, position.getY());
                break;
            case O:
                nextPosition = new Position(position.getX() - 1, position.getY());
                break;
            default:
                nextPosition = new Position(position.getX(), position.getY());
                break;
        }
        return nextPosition;
    }

    public static Orientation moveRight(final Orientation orientation)
    {
        final Orientation nextOrientation;

        switch (orientation) {
            case N:
                nextOrientation = Orientation.E;
                break;
            case S:
                nextOrientation = Orientation.O;
                break;
            case E:
                nextOrientation = Orientation.S;
                break;
            case O:
                nextOrientation = Orientation.N;
                break;
            default:
                nextOrientation = orientation;
                break;
        }

        return nextOrientation;
    }

    public static Orientation moveLeft(final Orientation orientation)
    {

        final Orientation nextOrientation;

        switch (orientation) {
            case N:
                nextOrientation = Orientation.O;
                break;
            case S:
                nextOrientation = Orientation.E;
                break;
            case E:
                nextOrientation = Orientation.N;
                break;
            case O:
                nextOrientation = Orientation.S;
                break;
            default:
                nextOrientation = orientation;
                break;
        }

        return nextOrientation;
    }
}
