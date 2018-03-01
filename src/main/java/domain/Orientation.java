package domain;

public enum Orientation {
    NORTH("N"),
    SOUTH("S"),
    EST("E"),
    WEST("O");

    private final String orientation;

    Orientation(final String orientation) {
        this.orientation = orientation;

    }
}
