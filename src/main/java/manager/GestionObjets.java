package manager;

import entite.Aventurier;
import entite.Carte;
import entite.Case;
import entite.Montagne;
import entite.ObjetDeplacable;
import entite.Tresor;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de creation des objets en fonction du fichier
 *
 * @author laurentmourer
 */
public class GestionObjets {

    private List<ObjetDeplacable> listeObjetDeplacable;
    private List<Case> listeCase;
    private Carte carte;
    private GestionFichier gestionFichier;

    /**
     * Constructeur de la classe GestionObjets, instancie les listes d'objets
     * correspondant au ligne du fichier
     *
     * @param listeLignes une liste de ligne ou chaque ligne correspond à un
     * objet
     * @param delimiter le token qui separe chaque champs de la lignes
     */
    public GestionObjets(List<String> listeLignes, String delimiter) {
        gestionFichier = new GestionFichier();
        listeObjetDeplacable = new ArrayList();
        listeCase = new ArrayList();

        listeLignes.stream().map((ligne) -> ligne.split(delimiter)).map((tokenLigne) -> {
            if ("C".equalsIgnoreCase(tokenLigne[0].trim())) {
                carte = new Carte(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim()));
            }
            return tokenLigne;
        }).filter((tokenLigne) -> (carte != null)).map((tokenLigne) -> {
            if (tokenLigne[0].trim().equalsIgnoreCase("T")) {
                Tresor t = new Tresor(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim()), Integer.parseInt(tokenLigne[3].trim()));
                listeCase.add(t);
            }
            return tokenLigne;
        }).map((tokenLigne) -> {
            if (tokenLigne[0].trim().equalsIgnoreCase("M")) {
                Montagne m = new Montagne(Integer.parseInt(tokenLigne[1].trim()), Integer.parseInt(tokenLigne[2].trim()));
                listeCase.add(m);
            }
            return tokenLigne;
        }).filter((tokenLigne) -> (tokenLigne[0].trim().equalsIgnoreCase("A"))).map((tokenLigne) -> new Aventurier(tokenLigne[1], Integer.parseInt(tokenLigne[2].trim()), Integer.parseInt(tokenLigne[3].trim()), tokenLigne[4], tokenLigne[5])).forEachOrdered((aventurier) -> {
            listeObjetDeplacable.add(aventurier);
        });
    }

    /**
     * Methode qui recopie les listes dans un fichier
     *
     * @param fichier
     */
    public void recopieObjetDansFichier(String fichier) {
        List<String> liste = new ArrayList();
        liste.add(carte.toString());
        this.listeCase.forEach((caase) -> {
            liste.add(caase.toString());
        });
        this.listeObjetDeplacable.forEach((aventurier) -> {
            liste.add(aventurier.toString());
        });
        gestionFichier.ecrireFichier(fichier, liste);
    }

    public List<ObjetDeplacable> getListeObjetDeplacable() {
        return listeObjetDeplacable;
    }

    public void setListeObjetDeplacable(List<ObjetDeplacable> listeObjetDeplacable) {
        this.listeObjetDeplacable = listeObjetDeplacable;
    }

    public List<Case> getListeCase() {
        return listeCase;
    }

    public void setListeCase(List<Case> listeCase) {
        this.listeCase = listeCase;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

}
