package com.laurent.manager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class IOFile {

    public String getFile(final String fileName) {
        final ClassLoader classLoader = getClass().getClassLoader();
        final StringBuilder stringBuilder = new StringBuilder();

        try {
            stringBuilder.append(IOUtils.toString(classLoader.getResourceAsStream(fileName), Charset.defaultCharset()));
        } catch (final IOException e) {
            e.printStackTrace();
        }


        return stringBuilder.toString();
    }

    public static void writeFile(final String lines, final String fileName) {
        final File file = new File(fileName);

        try {
            FileUtils.writeStringToFile(file, lines, Charset.defaultCharset());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    IOFile() {
        // NOP
    }

}