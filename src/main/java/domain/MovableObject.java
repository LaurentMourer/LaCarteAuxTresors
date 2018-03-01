package domain;

import com.google.common.base.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public abstract class MovableObject {

    private final Position position;
    private final Orientation orientation;
    private final Movement[] sequence;

    MovableObject(final Position position,
                  final Orientation orientation,
                  final Movement[] sequence) {
        this.position = position;
        this.orientation = orientation;
        this.sequence = sequence;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final MovableObject that = (MovableObject) o;
        return Objects.equals(position, that.position) &&
                Arrays.equals(sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, sequence);
    }

    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Movement[] getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("position", position)
                .add("orientation", orientation)
                .add("sequence", sequence)
                .toString();
    }
}
