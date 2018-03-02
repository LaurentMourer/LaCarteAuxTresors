package com.laurent.manager;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

final class FileManager {

    static List<String> readFile() {
        final List<String> lines = newArrayList();
        try {
            final Path path = Paths.get(ClassLoader.getSystemResource("input.txt").toURI());
            lines.addAll(Files.readAllLines(path, StandardCharsets.UTF_8));
        } catch (final IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        return lines;
    }

    static void writeFile(final List<String> lines) {
        final Path path = Paths.get("src/main/resources/output.txt");
        try {
            Files.write(path, lines, StandardCharsets.UTF_8);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private FileManager() {
        // NOP
    }

}