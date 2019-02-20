package com.laurent.utils;

public final class StringHelper {

    private StringHelper()
    {
        // NOP
    }

    public static int getInt(final String s)
    {
        return Integer.parseInt(getLines(s));
    }

    private static String getLines(final String s)
    {
        return s.trim();
    }
}
