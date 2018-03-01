package domain;

import com.google.common.base.Objects;

import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;

public class Treasures extends Case {

    private final Collection<Treasure> treasures = newArrayList();


    public Treasures(Position position) {
        super(position, true);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Treasures treasures1 = (Treasures) o;
        return Objects.equal(treasures, treasures1.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), treasures);
    }

    public void addTreasure(final Treasure treasure) {
        treasures.add(treasure);
    }

    public Collection<Treasure> getTreasures() {
        return treasures;
    }

    @Override
    public String toString() {
        return "Treasures{" +
                "treasures=" + treasures +
                '}';
    }
}
