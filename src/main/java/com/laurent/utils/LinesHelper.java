package com.laurent.utils;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public final class LinesHelper {

    private LinesHelper()
    {
        // NOP
    }

    public static List<List<String>> getLines(final String fileLines, final String delimiter)
    {
        final List<String> lines = getTokensWithCollection(fileLines, "\n");

        return lines.stream()
                    .map(e -> getTokensWithCollection(e, delimiter))
                    .collect(Collectors.toList());
    }

    private static List<String> getTokensWithCollection(final String str, final String delimiter)
    {
        return Collections.list(new StringTokenizer(str, delimiter)).stream()
                          .map(token -> token.toString().trim())
                          .collect(Collectors.toList());
    }
}
