package entite;

/**
 * Classe de gestion des montagnes
 *
 * @author Laurent Mourer
 */
public class Montagne extends Case {

    public Montagne(int x, int y) {
        super(x, y, false);
    }

    @Override
    public String toString() {
        return "M - " + super.toString();
    }

}
