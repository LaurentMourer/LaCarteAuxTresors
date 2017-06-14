package manager;

import entite.Aventurier;
import entite.Carte;
import entite.Montagne;
import entite.ObjetDeplacable;
import entite.Tresor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de gestion du jeu
 *
 * @author Laurent Mourer
 */
public class ModeleDuJeu {

    Carte carte;
    ManagerFichier managerFichier;
    List<ObjetDeplacable> listeAventurier;

    public ModeleDuJeu() {
        ClassLoader classLoader = getClass().getClassLoader();
        managerFichier = new ManagerFichier(classLoader.getResource("test.txt").getFile());
        List<String> listeLignes = managerFichier.getLignes();
        Creation creation = new Creation(listeLignes, " - ");
        listeAventurier = creation.getListeObjetDeplacable();
        carte = creation.getCarte();

    }

    public void lectureSequence() {
        for (ObjetDeplacable aventurier : listeAventurier) {

            boolean collision = false;
            for (int i = 0; i < aventurier.getSequence().length; i++) {

                ObjetDeplacable futureCase = null;
                try {
                    futureCase = aventurier.clone();
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(ModeleDuJeu.class.getName()).log(Level.SEVERE, null, ex);
                }

                futureCase.avancer();

                switch (aventurier.getSequence()[i]) {
                    case 'A': //Si la sequence contient avancer
                        if (futureCase.getX() >= 0 && futureCase.getY() >= 0 && futureCase.getX() < carte.getX() && futureCase.getY() < carte.getY() && carte.getCase(futureCase.getX(), futureCase.getY()).isFranchissable()) {
                            //On verfie que l'aventurier sera toujours dans les limites de la map
                            //Et qu'il ne va pas être sur une case non franchissable (Montagne)
                            if (listeAventurier.contains(futureCase)) {
                                //On verifie qu'il n'aille pas la ou il y a déja un aventurier
                                collision = true;
                            }
                            // Si toutes ces conditions sont rempli
                            if (!collision) {
                                //On regarde si il est sur une case tresor
                                if (carte.getCase(futureCase.getX(), futureCase.getY()) instanceof Tresor && aventurier instanceof Aventurier) {
                                    //Si il est sur une case tresor, on le prend
                                    ((Tresor) carte.getCase(futureCase.getX(), futureCase.getY())).tresorPris();
                                    //Et on incremente son compteur de tresor ramassé
                                    ((Aventurier) aventurier).ramasseTresor();
                                }
                                //puis on fait avancer l'aventurier
                                aventurier.avancer();
                            }
                        }
                        break;
                    case 'G': //Si la sequence contient gauche
                        aventurier.gauche();
                        break;
                    case 'D': //Si la sequence indique droite
                        aventurier.droite();
                        break;
                    default:
                        break;
                }
                System.out.println(aventurier.toString());
            }
        }
    }

}
