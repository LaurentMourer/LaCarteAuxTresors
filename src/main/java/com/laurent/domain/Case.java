package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public class Case {

    private final Position position;
    private final boolean passable;

    public Case(final Position position,
                final boolean passable) {
        this.position = position;
        this.passable = passable;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        final Case aCase = (Case) o;
        return passable == aCase.passable &&
                Objects.equals(position, aCase.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, passable);
    }

    public Position getPosition() {
        return position;
    }

    public boolean isPassable() {
        return passable;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("position", position)
                .add("passable", passable)
                .toString();
    }
}