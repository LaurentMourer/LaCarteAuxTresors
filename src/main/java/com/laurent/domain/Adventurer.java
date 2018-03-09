package com.laurent.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Adventurer {

    private final String name;

    private final List<Position> position = Lists.newArrayList();
    private final List<Orientation> orientation = Lists.newArrayList();
    private final List<Movement> movements = Lists.newArrayList();

    private final AtomicInteger countTreasure = new AtomicInteger(0);

    public Adventurer(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        final Adventurer that = (Adventurer) o;
        return Objects.equal(name, that.name) &&
                Objects.equal(position, that.position) &&
                Objects.equal(orientation, that.orientation) &&
                Objects.equal(movements, that.movements) &&
                Objects.equal(countTreasure, that.countTreasure);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, position, orientation, movements, countTreasure);
    }

    public String getName() {
        return name;
    }

    public List<Position> getPosition() {
        return position;
    }

    public List<Orientation> getOrientation() {
        return orientation;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public AtomicInteger getCountTreasure() {
        return countTreasure;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("positions", position)
                .add("orientations", orientation)
                .add("movements", movements)
                .add("countTreasure", countTreasure)
                .toString();
    }
}

