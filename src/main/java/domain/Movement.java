package domain;

public enum Movement {

    MOVE_FORWARD("A"),
    MOVE_RIGHT("D"),
    MOVE_LEFT("G");

    private final String Movement;


    Movement(final String movement) {
        Movement = movement;
    }


}
