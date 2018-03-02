package com.laurent.factory;

import com.laurent.domain.Case;
import com.laurent.domain.Position;
import com.laurent.domain.TreasureMap;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public final class TreasureMapFactory {

    public static List<TreasureMap> createMap(final List<String> lines, final String delimiter) {
        final List<TreasureMap> treasureMaps = newArrayList();

        lines.stream()
                .map(line -> line.split(delimiter))
                .forEach(line -> {
                    if ("C".equalsIgnoreCase(getLines(line[0]))) {
                        treasureMaps.add(createTreasureMap(getInt(line[1]),
                                getInt(line[2])));
                    }
                });

        return treasureMaps;
    }

    private static TreasureMap createTreasureMap(final int width, final int length) {

        return new TreasureMap(width, length, initTreasureMap(width, length));
    }

    private static Case[][] initTreasureMap(final int width, final int length) {
        final Case[][] treasureMap = new Case[width][length];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                treasureMap[i][j] = new Case(new Position(i, j), true);
            }
        }

        return treasureMap;
    }


    private static int getInt(final String s) {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s) {
        return s.trim();
    }

    private TreasureMapFactory() {
        // NOP
    }
}
