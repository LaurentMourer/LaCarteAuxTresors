package com.laurent.manager;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

final class LinesRepository {

    static List<List<String>> getLines(final List<String> fileLines, final String delimiter)
    {
        return fileLines.stream()
                        .map(e -> getTokensWithCollection(e, delimiter))
                        .collect(Collectors.toList());
    }

    private static List<String> getTokensWithCollection(final String str, final String delimiter)
    {
        return Collections.list(new StringTokenizer(str, delimiter)).stream()
                          .map(token -> (String) token)
                          .collect(Collectors.toList());
    }
}
