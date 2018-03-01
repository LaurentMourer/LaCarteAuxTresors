package manager;

import domain.Adventurer;
import domain.TreasureMap;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;


public final class ObjectsManager {

    static void writeInFile(final TreasureMap treasureMap,
                            final Collection<Adventurer> adventurers) {
        final List<String> lines = newArrayList();

        lines.add(treasureMap.toString());

        treasureMap.getTreasureMap().forEach(aCase -> {
            lines.add(aCase.toString());
        });

        adventurers.forEach(adventurer -> {
            lines.add(adventurer.toString());
        });

        FileManager.writeFile(lines);
    }

    private ObjectsManager() {
        // NOP
    }
}
