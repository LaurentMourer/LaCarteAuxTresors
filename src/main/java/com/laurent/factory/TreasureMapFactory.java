package com.laurent.factory;

import com.laurent.domain.Case;
import com.laurent.domain.Position;
import com.laurent.domain.TreasureMap;
import com.laurent.utils.StringHelper;

import java.util.List;

public final class TreasureMapFactory {

    private TreasureMapFactory()
    {
        // NOP
    }

    public static TreasureMap createMap(final List<String> line)
    {
        final int width = StringHelper.getInt(line.get(1));
        final int height = StringHelper.getInt(line.get(2));

        return new TreasureMap(width, height, initTreasureMap(width, height));
    }

    private static Case[][] initTreasureMap(final int width, final int length)
    {
        final Case[][] treasureMap = new Case[width][length];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                treasureMap[i][j] = new Case(new Position(i, j), true);
            }
        }

        return treasureMap;
    }
}
