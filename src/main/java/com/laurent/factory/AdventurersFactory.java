package com.laurent.factory;

import com.google.common.collect.Lists;
import com.laurent.domain.Adventurer;
import com.laurent.domain.Movement;
import com.laurent.domain.Orientation;
import com.laurent.domain.Position;

import java.util.List;

public final class AdventurersFactory {

    public static Adventurer createAdventurers(final List<String> lines)
    {
        return new Adventurer(lines.get(1),
                              Lists.newArrayList(new Position(StringHelper.getInt(lines.get(2)), StringHelper.getInt(lines.get(3)))),
                              Lists.newArrayList(Orientation.valueOf(lines.get(4))),
                              getMovements(lines.get(5)));
    }

    private static List<Movement> getMovements(final String sequence)
    {
        final char[] sequences = sequence.toCharArray();

        final Movement[] movements = new Movement[sequence.length()];
        for (int i = 0; i < sequences.length; i++) {

            movements[i] = Movement.valueOf(String.valueOf(sequences[i]));
        }
        return Lists.newArrayList(movements);
    }
}
