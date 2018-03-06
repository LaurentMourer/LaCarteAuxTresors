package com.laurent.factory;

final class StringHelper {

    static int getInt(final String s)
    {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s)
    {
        return s.trim();
    }
}
