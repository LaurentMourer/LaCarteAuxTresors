package com.laurent.domain;

public enum Movement {

    A("Move_forward"),
    D("Move_right"),
    G("Move_left");

    private final String Movement;


    Movement(final String movement) {
        Movement = movement;
    }


}
