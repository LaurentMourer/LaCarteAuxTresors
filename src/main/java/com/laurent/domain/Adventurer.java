package com.laurent.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import java.util.List;

public class Adventurer extends Character {

    private final List<Treasure> treasures = Lists.newArrayList();

    public Adventurer(final String name,
                      final List<Position> positions,
                      final List<Orientation> orientations,
                      final Movement[] movements) {
        super(name, positions, orientations, movements);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Adventurer that = (Adventurer) o;
        return Objects.equal(treasures, that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(treasures);
    }

    public void addTreasure(final Treasure treasure) {
        treasures.add(treasure);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("treasures", treasures)
                .toString();
    }
}

