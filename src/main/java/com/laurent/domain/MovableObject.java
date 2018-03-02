package com.laurent.domain;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;


public abstract class MovableObject {

    private final List<Position> positions = Lists.newArrayList();
    private final List<Orientation> orientations = Lists.newArrayList();
    private final List<Movement> movements = Lists.newArrayList();

    MovableObject(final List<Position> positions,
                  final List<Orientation> orientations,
                  final List<Movement> movements) {
        this.positions.addAll(positions);
        this.orientations.addAll(orientations);
        this.movements.addAll(movements);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final MovableObject that = (MovableObject) o;
        return Objects.equals(positions, that.positions) &&
                Objects.equals(orientations, that.orientations) &&
                Objects.equals(movements, that.movements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positions, orientations, movements);
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void addPosition(final Position position) {
        positions.add(position);
    }


    public List<Orientation> getOrientations() {
        return orientations;
    }

    public void addOrientation(final Orientation orientation) {
        orientations.add(orientation);
    }

    public List<Movement> getMovements() {
        return movements;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("positions", positions)
                .add("orientations", orientations)
                .add("movements", movements)
                .toString();
    }
}
