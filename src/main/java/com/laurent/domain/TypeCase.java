package com.laurent.domain;

public enum TypeCase {
    TREASURE("T"),
    MOUNTAIN("M"),
    ADVENTURER("A"),
    MAP("C");

    final String type;

    TypeCase(final String type) {
        this.type = type;
    }

}
