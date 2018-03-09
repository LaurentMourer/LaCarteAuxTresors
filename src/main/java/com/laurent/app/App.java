package com.laurent.app;

import com.laurent.config.AppConfig;
import com.laurent.manager.GameService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {

    public static void main(final String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        final GameService myService = ctx.getBean(GameService.class);
        myService.run();
    }
}
