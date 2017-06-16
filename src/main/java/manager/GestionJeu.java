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

    /**
     * Constructeur de la classe GestionJeu, Il instancie toutes les classes et
     * liste nessessaire à l'execution du jeu
     *
     */
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

    /**
     * lecture de la sequence de chaque aventurier
     *
     */
    public void lectureSequence() {
        for (ObjetDeplacable aventurier : listeAventurier) {
            //Si l'aventurier spawn sur la meme case qu'un tresor, on le ramasse;
            isTresor(aventurier);
            for (int i = 0; i < aventurier.getSequence().length; i++) {

                ObjetDeplacable futureCase = null;
                try {
                    futureCase = aventurier.clone();
                    futureCase.avancer();
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(GestionJeu.class.getName()).log(Level.SEVERE, null, ex);
                }

                switch (aventurier.getSequence()[i]) {
                    case 'A': //Si la sequence contient avancer
                        if (isDeplacable(futureCase)) {
                            //On regarde si il est sur une case tresor
                            //puis on fait avancer l'aventurier
                            aventurier.avancer();
                            isTresor(aventurier);
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

    /**
     * traitement si la case ou se trouve un objet deplacable est un tresor
     *
     * @param objetDeplacable
     */
    public void isTresor(ObjetDeplacable objetDeplacable) {
        if (carte.getCase(objetDeplacable.getX(), objetDeplacable.getY()) instanceof Tresor && objetDeplacable instanceof Aventurier) {
            //Si il est sur une case tresor, on le prend
            ((Tresor) carte.getCase(objetDeplacable.getX(), objetDeplacable.getY())).tresorPris();
            //Et on incremente son compteur de tresor ramassé
            ((Aventurier) objetDeplacable).ramasseTresor();
        }
    }

    /**
     * verifie si le prochaine déplacement d'un objetDeplcable est possible
     *
     * @param o
     * @return vrai si il peut se deplacer, faux sinon
     */
    public boolean isDeplacable(ObjetDeplacable o) {
        if (o.getX() >= 0 && o.getY() >= 0 && o.getX() < carte.getX() && o.getY() < carte.getY() && carte.getCase(o.getX(), o.getY()).isFranchissable()) {
            //On verfie que l'aventurier sera toujours dans les limites de la map
            //Et qu'il ne va pas être sur une case non franchissable (Montagne)
            return !listeAventurier.contains(o); //On verifie qu'il n'aille pas la ou il y a déja un aventurier
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(creation.getListeObjetDeplacable().toArray()) + "\n" + Arrays.toString(creation.getListeCase().toArray());

    }

}
