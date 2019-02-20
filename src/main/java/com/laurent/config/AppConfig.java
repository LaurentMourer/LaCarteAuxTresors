package com.laurent.config;

import com.laurent.repository.FileRepository;
import com.laurent.service.GameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.laurent")
public class AppConfig {

    @Bean
    public GameService gameManager(final FileRepository fileRepository) {
        return new GameService(fileRepository);
    }
}