package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Treasures extends Case {

    private final AtomicInteger count;


    public Treasures(final Position position, final AtomicInteger count) {
        super(position, true);
        this.count = count;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Treasures treasures = (Treasures) o;
        return Objects.equals(count, treasures.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), count);
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void removeTreasure() {
        count.decrementAndGet();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("count", count)
                .toString();
    }
}
