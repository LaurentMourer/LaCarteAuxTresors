package entite;

/**
 * Classe de gestion des aventuriers
 *
 * @author Laurent Mourer
 */
public class Aventurier extends Personnage {

    private int tresorRamasse;

    /**
     * Constructeur de la classe Aventurier
     *
     * @param nom Nom de l'aventurier
     * @param x Position horizontale de l'aventurier
     * @param y Position verticale de l'aventurier
     * @param orientation orientation de l'aventurier
     * @param sequence sequence de l'aventurier
     */
    public Aventurier(String nom, int x, int y, String orientation, String sequence) {
        super(nom, x, y, orientation, sequence);
        tresorRamasse = 0;
    }

    /**
     * Ramasse un tresor Incremente la variable tresorRamasse
     */
    public void ramasseTresor() {
        tresorRamasse++;
    }

    public int getTresorRamasse() {
        return tresorRamasse;
    }

    public void setTresorRamasse(int tresorRamasse) {
        this.tresorRamasse = tresorRamasse;
    }

    @Override
    public String toString() {
        return "A - " + super.toString() + " - " + tresorRamasse;
    }
}
