package domain;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public abstract class Character extends MovableObject {

    private final String name;

    protected Character(final String name,
                        final Position position,
                        final Orientation orientation,
                        final char[] sequence) {
        super(position, orientation, sequence);
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