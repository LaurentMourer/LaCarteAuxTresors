package domain;

public enum Orientation {
    N("North"),
    S("South"),
    E("Est"),
    O("West");

    final String orientation;

    Orientation(final String orientation) {
        this.orientation = orientation;
    }
}
