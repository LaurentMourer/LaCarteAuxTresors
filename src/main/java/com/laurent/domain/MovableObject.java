package com.laurent.domain;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public abstract class MovableObject {

    private final List<Position> positions = Lists.newArrayList();
    private final List<Orientation> orientations = Lists.newArrayList();
    private final Movement[] sequence;

    MovableObject(final List<Position> positions,
                  final List<Orientation> orientations,
                  final Movement[] sequence) {
        this.positions.addAll(positions);
        this.orientations.addAll(orientations);
        this.sequence = sequence;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final MovableObject that = (MovableObject) o;
        return Objects.equals(positions, that.positions) &&
                Arrays.equals(sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positions, sequence);
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void addPosition(final Position position) {
        positions.add(position);
    }

    public void addOrientation(final Orientation orientation) {
        orientations.add(orientation);
    }

    public List<Orientation> getOrientations() {
        return orientations;
    }

    public Movement[] getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("position", positions)
                .add("orientation", orientations)
                .add("sequence", sequence)
                .toString();
    }
}
