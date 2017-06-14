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
        listeAventurier = new ArrayList();
        managerFichier = new ManagerFichier("/Users/laurentmourer/Downloads/LaCarteAuxTresors/LaCarteAuxTresors/target/classes/test.txt");
        List<String> listeLignes = managerFichier.getLignes();

        listeLignes.stream().map((ligne) -> ligne.split(" - ")).map((tokenLigne) -> {
            if ("C".equalsIgnoreCase(tokenLigne[0].trim())) {
                carte = new Carte(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim()));
            }
            return tokenLigne;
        }).filter((tokenLigne) -> (carte != null)).map((tokenLigne) -> {
            if (tokenLigne[0].trim().equalsIgnoreCase("T")) {
                carte.ajouterObjet(new Tresor(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim()), Integer.parseInt(tokenLigne[3].trim())));
            }
            return tokenLigne;
        }).map((tokenLigne) -> {
            if (tokenLigne[0].trim().equalsIgnoreCase("M")) {
                carte.ajouterObjet(new Montagne(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim())));
            }
            return tokenLigne;
        }).filter((tokenLigne) -> (tokenLigne[0].trim().equalsIgnoreCase("A"))).map((tokenLigne) -> new Aventurier(tokenLigne[1], Integer.parseInt(tokenLigne[2].trim()), Integer.parseInt(tokenLigne[3].trim()), tokenLigne[4], tokenLigne[5])).forEachOrdered((aventurier) -> {
            listeAventurier.add(aventurier);
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
            }
        }
    }
    
}
