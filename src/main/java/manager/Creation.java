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
 *
 * @author laurentmourer
 */
public class Creation {

    private List<ObjetDeplacable> listeObjetDeplacable;
    private List<Case> listeCase;
    Carte carte;

    public Creation(List<String> listeLignes, String delimiter) {
        
        listeObjetDeplacable = new ArrayList();
        listeCase = new ArrayList();

        listeLignes.stream().map((ligne) -> ligne.split(delimiter)).map((tokenLigne) -> {
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
            listeObjetDeplacable.add(aventurier);
        });
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
