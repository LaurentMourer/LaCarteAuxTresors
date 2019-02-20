package com.laurent.app;

import com.laurent.config.AppConfig;
import com.laurent.service.GameService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {

    public static void main(final String[] args)
    {
        try (final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            applicationContext.getBean(GameService.class).run();
        }
    }
}
