package com.laurent.factory;

import com.google.common.collect.Lists;
import com.laurent.domain.Adventurer;
import com.laurent.domain.Movement;
import com.laurent.domain.Orientation;
import com.laurent.domain.Position;
import com.laurent.utils.StringHelper;

import java.util.List;

public final class AdventurersFactory {

    private AdventurersFactory()
    {
        // NOP
    }

    public static Adventurer createAdventurers(final List<String> lines)
    {
        final Adventurer adventurer = new Adventurer(lines.get(1));

        adventurer.getPosition().add(new Position(StringHelper.getInt(lines.get(2)), StringHelper.getInt(lines.get(3))));
        adventurer.getOrientation().add(Orientation.valueOf(lines.get(4)));
        adventurer.getMovements().addAll(getMovements(lines.get(5)));

        return adventurer;
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
