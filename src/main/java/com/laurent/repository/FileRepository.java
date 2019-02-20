package com.laurent.repository;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

@Component
public final class FileRepository {

    private final Logger logger = LoggerFactory.getLogger(FileRepository.class);

    private final ClassLoader classLoader = getClass().getClassLoader();

    public String getFile(final String fileName)
    {

        final StringBuilder stringBuilder = new StringBuilder();

        try {
            stringBuilder.append(IOUtils.toString(classLoader.getResourceAsStream(fileName), Charset.defaultCharset()));
        } catch (final IOException e) {
            logger.error(e.getMessage(), e);
        }

        return stringBuilder.toString();
    }

    public void writeFile(final String lines, final String fileName)
    {
        final File file = new File(fileName);

        try {
            FileUtils.writeStringToFile(file, lines, Charset.defaultCharset());
        } catch (final IOException e) {
            logger.error(e.getMessage(), e);
        }
    }
}