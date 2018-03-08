package com.laurent.manager;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class IOFileTest {

    @Test
    public void test_readFile() {
        // GIVEN
        final IOFile ioFile = new IOFile();

        // WHEN
        final String actual = ioFile.getFile("input.txt");

        // THEN
        Assertions.assertThat(actual).isNotBlank();
    }

    @Test
    public void test_writeFile() {
        // GIVEN
        final String fileName = "fileName";
        final String content = "content";

        // WHEN
        IOFile.writeFile(content, fileName);
    }
}