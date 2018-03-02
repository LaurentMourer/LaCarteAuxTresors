package Factory;

import domain.Adventurer;
import domain.Movement;
import domain.Orientation;
import domain.Position;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public final class AdventurersFactory {

    public static List<Adventurer> createAdventurers(final List<String> lines, final String delimiter) {
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

    private static void addAdventurer(final String[] line, final List<Adventurer> adventurers) {
        adventurers.add(new Adventurer(line[1], newArrayList(new Position(getInt(line[2]), getInt(line[3]))),
                newArrayList(Orientation.valueOf(line[4])),
                getMovements(line[5])));
    }

    private static Movement[] getMovements(final String sequence) {
        final char[] sequences = sequence.toCharArray();

        final Movement[] movements = new Movement[sequence.length()];
        for (int i = 0; i < sequences.length; i++) {

            movements[i] = Movement.valueOf(String.valueOf(sequences[i]));
        }
        return movements;

    }

    private static int getInt(final String s) {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s) {
        return s.trim();
    }

}
