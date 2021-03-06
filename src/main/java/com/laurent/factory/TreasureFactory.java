package com.laurent.factory;

import com.laurent.domain.Position;
import com.laurent.domain.Treasure;
import com.laurent.utils.StringHelper;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class TreasureFactory {

    private TreasureFactory()
    {
        // NOP
    }

    public static Treasure createTreasure(final List<String> line)
    {
        return new Treasure(new Position(StringHelper.getInt(line.get(1)),
                                         StringHelper.getInt(line.get(2))),
                            new AtomicInteger(Integer.parseInt(line.get(3))));
    }
}
