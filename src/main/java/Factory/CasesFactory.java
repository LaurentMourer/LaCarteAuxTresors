package Factory;

import domain.*;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public final class CasesFactory {

    public static List<Case> createCases(final List<String> lines, final String delimiter) {

        final List<Case> cases = newArrayList();

        lines.stream().map(line -> line.split(delimiter))
                .forEach(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("T")) {
                        addTreasure(line, cases);
                    }
                });

        lines.stream().map(line -> line.split(delimiter))
                .forEach(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("M")) {
                        addMountain(line, cases);
                    }
                });
        return cases;
    }


    private static void addMountain(final String[] line, final List<Case> cases) {
        cases.add(new Mountain(new Position(getInt(line[1]),
                getInt(line[2]))));
    }

    private static void addTreasure(final String[] line, final List<Case> cases) {
        final Treasures treasures = new Treasures(new Position(getInt(line[1]), getInt(line[2])));


        final int treasureCount = getInt(line[3]);

        for (int i = 0; i < treasureCount; i++) {
            treasures.addTreasure(new Treasure());
        }

        cases.add(treasures);
    }

    private static int getInt(final String s) {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s) {
        return s.trim();
    }


}
