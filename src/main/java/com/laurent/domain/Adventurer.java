package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Adventurer extends Character {

    private final AtomicInteger countTreasure = new AtomicInteger(0);

    public Adventurer(final String name,
                      final List<Position> positions,
                      final List<Orientation> orientations,
                      final List<Movement> movements) {
        super(name, positions, orientations, movements);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Adventurer that = (Adventurer) o;
        return java.util.Objects.equals(countTreasure, that.countTreasure);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), countTreasure);
    }

    public AtomicInteger getCountTreasure() {
        return countTreasure;
    }

    public void addTreasure() {
        countTreasure.incrementAndGet();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("countTreasure", countTreasure)
                .toString();
    }
}

