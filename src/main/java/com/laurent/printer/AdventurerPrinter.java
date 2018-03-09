package com.laurent.printer;

import com.laurent.domain.Adventurer;

import java.util.List;

public final class AdventurerPrinter {

    public static String print(final List<Adventurer> adventurers) {
        final StringBuilder stringBuilder = new StringBuilder();

        adventurers.forEach(adventurer -> {
            stringBuilder.append(adventurer);
            stringBuilder.append("\n");
        });

        return stringBuilder.toString();

    }
}
