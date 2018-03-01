package Factory;

import domain.Case;
import domain.Position;
import domain.TreasureMap;

import java.util.Collection;
import java.util.List;

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


    public static Collection<Case> createMap(final List<String> lines, final String delimiter) {
        TreasureMap treasureMap;


        lines.stream()
                .map(line -> line.split(delimiter))
                .forEach(line -> {
                    if ("C".equalsIgnoreCase(getLines(line[0]))) {
                        treasureMap = TreasureMapFactory.createTreasureMap(getInt(line[1]),
                                getInt(line[2]));
                    }
                });
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
