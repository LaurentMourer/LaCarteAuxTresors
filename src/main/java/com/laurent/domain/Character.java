package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.List;
import java.util.Objects;

public abstract class Character extends MovableObject {

    private final String name;

    Character(final String name,
              final List<Position> positions,
              final List<Orientation> orientations,
              final List<Movement> movements) {
        super(positions, orientations, movements);
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString();
    }
}