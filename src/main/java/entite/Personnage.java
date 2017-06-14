package entite;

/**
 * Classe de gestion des personnages
 *
 * @author Laurent Mourer
 */
public class Personnage extends ObjetDeplacable {

    private String nom;

    public Personnage(String _nom, int x, int y, String orientation, String sequence) {
        super(x, y, orientation, sequence);
        nom = _nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom + " - " + super.toString();
    }

}
