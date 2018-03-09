package com.laurent.printer;

import com.laurent.domain.TreasureMap;

import java.util.Arrays;

public final class TreasureMapPrinter {

    public static String print(final TreasureMap treasureMap) {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(treasureMap);
        stringBuilder.append("\n");

        Arrays.stream(treasureMap.getTreasureMap()).forEach(aCase -> {
            stringBuilder.append(Arrays.toString(aCase));
            stringBuilder.append("\n");

        });

        return stringBuilder.toString();
    }

    private TreasureMapPrinter() {
        // NOP
    }
}
