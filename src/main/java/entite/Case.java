package entite;

/**
 * Classe de gestion des cases
 *
 * @author Laurent Mourer
 */
public class Case {

    private int x;
    private int y;
    private boolean franchissable;

    /**
     * Constructeur de la classe Case
     *
     * @param x Position horizontale de la case
     * @param y Position verticale de la case
     * @param franchissable La case est-elle franchissable ou non
     */
    public Case(int x, int y, boolean franchissable) {
        this.x = x;
        this.y = y;
        this.franchissable = franchissable;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFranchissable() {
        return franchissable;
    }

    public void setFranchissable(boolean franchissable) {
        this.franchissable = franchissable;
    }

    @Override
    public String toString() {
        return x + " - " + y;
    }

}
