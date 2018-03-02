package com.laurent.domain;

import com.google.common.base.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public class TreasureMap {

    private final int width;
    private final int length;
    private final Case[][] treasureMap;

    public TreasureMap(final int width, final int length, final Case[][] treasureMap) {
        this.width = width;
        this.length = length;
        this.treasureMap = treasureMap;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TreasureMap that = (TreasureMap) o;
        return width == that.width &&
                length == that.length &&
                Arrays.equals(treasureMap, that.treasureMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, treasureMap);
    }


    public void addObject(final Case aCase) {
        treasureMap[aCase.getPosition().getX()][aCase.getPosition().getY()] = aCase;
    }

    public Case[][] getTreasureMap() {
        return treasureMap;
    }

    public Case getCase(final int x, final int y) {
        return treasureMap[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("width", width)
                .add("length", length)
                .add("treasureMap", treasureMap)
                .toString();
    }
}
