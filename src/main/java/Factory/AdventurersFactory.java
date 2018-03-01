package Factory;

import domain.Adventurer;
import domain.Orientation;
import domain.Position;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class AdventurersFactory {

    public static Collection<Adventurer> createAdventurers(final List<String> lines, final String delimiter) {
        final List<Adventurer> adventurers = newArrayList();

        lines.stream()
                .map(line -> line.split(delimiter))
                .forEach(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("A")) {
                        addAdventurer(line, adventurers);
                    }
                });

        return adventurers;
    }

    private static void addAdventurer(String[] line, final Collection<Adventurer> adventurers) {
        adventurers.add(new Adventurer(line[1], new Position(getInt(line[2]), getInt(line[3])),
                Orientation.valueOf(line[4]),
                line[5].toCharArray()));
    }

    private static int getInt(final String s) {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s) {
        return s.trim();
    }

}
