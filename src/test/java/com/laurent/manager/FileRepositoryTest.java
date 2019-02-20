package com.laurent.manager;

import com.laurent.config.AppConfig;
import com.laurent.repository.FileRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class FileRepositoryTest {

    @Autowired
    private FileRepository fileRepository;

    @Test
    public void test_readFile() {
        // WHEN
        final String actual = fileRepository.getFile("input.txt");

        // THEN
        Assertions.assertThat(actual).isNotBlank();
    }

    @Test
    public void test_writeFile() {
        // GIVEN
        final String fileName = "fileName";
        final String content = "content";

        // WHEN
        fileRepository.writeFile(content, fileName);
    }
}