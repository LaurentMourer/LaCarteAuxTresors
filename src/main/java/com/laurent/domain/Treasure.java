package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Treasure extends Case {

    private final AtomicInteger count;


    public Treasure(final Position position, final AtomicInteger count) {
        super(position, true);
        this.count = count;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        if (!super.equals(o)) return false;
        final Treasure treasure = (Treasure) o;
        return Objects.equals(count, treasure.count);
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
