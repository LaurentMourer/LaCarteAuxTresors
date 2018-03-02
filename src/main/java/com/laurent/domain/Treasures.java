package com.laurent.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Treasures extends Case {

    private final List<Treasure> treasures = newArrayList();


    public Treasures(final Position position) {
        super(position, true);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Treasures treasures1 = (Treasures) o;
        return Objects.equal(treasures, treasures1.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), treasures);
    }

    public void addTreasure(final Treasure treasure) {
        treasures.add(treasure);
    }

    public Treasure removeTreasure(final Treasure treasure) {
        treasures.remove(treasure);

        return treasure;
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
