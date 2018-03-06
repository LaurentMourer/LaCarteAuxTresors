package com.laurent.factory;

import com.laurent.domain.Mountain;
import com.laurent.domain.Position;

import java.util.List;

public final class MountainFactory {

    public static Mountain createMountain(final List<String> line)
    {
        return new Mountain(new Position(StringHelper.getInt(line.get(1)),
                                         StringHelper.getInt(line.get(2))));
    }
}
