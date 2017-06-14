package app;

import manager.ModeleDuJeu;

/**
 * Classe principale
 *
 * @author Laurent Mourer
 */
public class App {

    public static void main(String[] args) {
        ModeleDuJeu modeleDuJeu = new ModeleDuJeu();
        modeleDuJeu.lectureSequence();

    }
}
