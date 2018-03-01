package Factory;

import domain.Case;
import domain.Position;
import domain.TreasureMap;

public final class TreasureMapFactory {

    public static TreasureMap createTreasureMap(final int width, final int length) {

        return new TreasureMap(width, length, initTreasureMap(width, length));
    }

    private static Case[][] initTreasureMap(final int width, final int length) {
        final Case[][] treasureMap = new Case[width][length];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                treasureMap[i][j] = new Case(new Position(width, length), true);
            }
        }

        return treasureMap;
    }

    private TreasureMapFactory() {
        // NOP
    }
}
