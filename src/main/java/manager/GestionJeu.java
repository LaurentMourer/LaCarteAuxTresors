package manager;

import entite.Aventurier;
import entite.Carte;
import entite.ObjetDeplacable;
import entite.Tresor;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de gestion du jeu
 *
 * @author Laurent Mourer
 */
public class GestionJeu {

    private final Carte carte;
    private final GestionFichier managerFichier;
    private final List<ObjetDeplacable> listeAventurier;
    private final GestionObjets creation;
    private final List<String> listeLignes;
    private final ClassLoader classLoader;

    public GestionJeu() {
        classLoader = getClass().getClassLoader();
        managerFichier = new GestionFichier();
        managerFichier.lireFichier();
        listeLignes = managerFichier.getLignes();
        creation = new GestionObjets(listeLignes, " - ");
        listeAventurier = creation.getListeObjetDeplacable();
        carte = creation.getCarte();
        creation.getListeCase().forEach((caase) -> {
            carte.ajouterObjet(caase);
        });

    }

    public void lectureSequence() {
        for (ObjetDeplacable aventurier : listeAventurier) {

            boolean collision = false;
            for (int i = 0; i < aventurier.getSequence().length; i++) {

                ObjetDeplacable futureCase = null;
                try {
                    futureCase = aventurier.clone();
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(GestionJeu.class.getName()).log(Level.SEVERE, null, ex);
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

    @Override
    public String toString() {
        return Arrays.toString(creation.getListeObjetDeplacable().toArray()) + "\n" + Arrays.toString(creation.getListeCase().toArray());

    }

}
