package entite;

/**
 * Classe de gestion des tresors
 *
 * @author Laurent Mourer
 */
public class Tresor extends Case {

    private int nbTresor;

    public Tresor(int x, int y, int _nbTresor) {
        super(x, y, true);
        nbTresor = _nbTresor;
    }

    public void tresorPris() {
        nbTresor--;
    }

    public int getNbTresor() {
        return nbTresor;
    }

    public void setNbTresor(int nbTresor) {
        this.nbTresor = nbTresor;
    }

    @Override
    public String toString() {
        return "T - " + super.toString() + " - " + nbTresor;
    }

}
