package com.laurent.app;

import com.laurent.manager.GameManager;

public final class App {

    private static final GameManager gameManager = new GameManager();

    public static void main(final String[] args) {
        gameManager.LaunchGame();
    }
}
