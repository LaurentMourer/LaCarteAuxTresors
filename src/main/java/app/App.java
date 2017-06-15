package app;

import manager.GestionJeu;

/**
 * Classe principale
 *
 * @author Laurent Mourer
 */
public class App {

    public static void main(String[] args) {
        GestionJeu modeleDuJeu = new GestionJeu();
        modeleDuJeu.lectureSequence();
        System.out.println(modeleDuJeu.toString());

    }
}
