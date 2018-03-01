package manager;

import Factory.TreasureMapFactory;
import com.google.common.collect.Lists;
import domain.*;

import java.util.List;


public class ObjectsManager {

    private final List<Adventurer> adventurers = Lists.newArrayList();
    private final List<Case> cases = Lists.newArrayList();

    ObjectsManager(final List<String> lines, final String delimiter) {

        lines.stream()
                .map(line -> line.split(delimiter))
                .peek(this::createMap)
                .peek(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("T")) {
                        cases.add(new Treasure(new Position(getPosition(line[1]),
                                getPosition(line[2])),
                                getPosition(line[3])));
                    }
                })
                .peek(line -> {
                    if (getLines(line[0]).equalsIgnoreCase("M")) {
                        cases.add(new Mountain(new Position(getPosition(line[1]),
                                getPosition(line[2]))));
                    }
                })
                .filter(line -> getLines(line[0])
                        .equalsIgnoreCase("A"))
                .map(line -> new Adventurer(line[1], new Position(getPosition(line[2]), getPosition(line[3])),
                        Orientation.valueOf(line[4]),
                        line[5].toCharArray()))
                .forEachOrdered(adventurers::add);
    }

    private int getPosition(final String s) {
        return Integer.parseInt(getLines(s));
    }

    private String getLines(final String s) {
        return s.trim();
    }

    private TreasureMap createMap(final String[] lines) {
        final TreasureMap treasureMap;
        if ("C".equalsIgnoreCase(getLines(lines[0]))) {
            treasureMap = TreasureMapFactory.createTreasureMap(getPosition(lines[1]),
                    getPosition(lines[2]));
        } else {
            treasureMap = null;
        }
        return treasureMap;
    }

    void writeInFile(final TreasureMap treasureMap) {
        final List<String> lines = Lists.newArrayList();

        lines.add(treasureMap.toString());

        cases.forEach(aCase -> {
            lines.add(aCase.toString());
        });

        adventurers.forEach(adventurer -> {
            lines.add(adventurer.toString());
        });

        FileManager.writeFile(lines);
    }

    List<Adventurer> getAdventurers() {
        return adventurers;
    }

    List<Case> getCases() {
        return cases;
    }


}
