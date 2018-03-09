package com.laurent.domain;

public enum Movement {

    MOVE_FORWARD("Move_forward"),
    TURN_RIGHT("Move_right"),
    TURN_LEFT("Move_left");

    final String movement;

    Movement(final String movement) {
        this.movement = movement;
    }

}
