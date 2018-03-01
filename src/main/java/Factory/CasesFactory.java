package Factory;

import domain.*;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public final class CasesFactory {

    public static Collection<Case> createCases(final List<String> lines, final String delimiter) {

        final Collection<Case> cases = newArrayList();

        lines.stream()
                .map(line -> line.split(delimiter))
                .peek(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("T")) {
                        addTreasure(line, cases);
                    }
                })
                .peek(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("M")) {
                        addMountain(line, cases);
                    }
                });

        return cases;
    }


    private static void addMountain(String[] line, final Collection<Case> cases) {
        cases.add(new Mountain(new Position(getInt(line[1]),
                getInt(line[2]))));
    }

    private static void addTreasure(String[] line, final Collection<Case> cases) {
        Treasures treasures = new Treasures(new Position(getInt(line[1]), getInt(line[2])));


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
