package domain;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public class Treasure extends Case {

    private final int count;

    public Treasure(final Position position,
                    final int count) {
        super(position, true);
        this.count = count;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Treasure treasure = (Treasure) o;
        return count == treasure.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), count);
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .toString();
    }
}