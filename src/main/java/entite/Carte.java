package entite;

/**
 * Classe de gestion de la carte
 *
 * @author Laurent Mourer
 */
public class Carte {

    private final Case[][] carte;
    int x;
    int y;

    /**
     * Constructeur de la classe Carte
     *
     * @param nbCaseLargeur Nombre de case de largeur de la carte
     * @param nbCaseLongueur Nombre de case de longueur de la carte
     */
    public Carte(int nbCaseLargeur, int nbCaseLongueur) {
        x = nbCaseLargeur;
        y = nbCaseLongueur;
        this.carte = new Case[nbCaseLargeur][nbCaseLongueur];
        for (int i = 0; i < nbCaseLargeur; i++) {
            for (int j = 0; j < nbCaseLongueur; j++) {
                carte[i][j] = new Case(i, j, true);
            }
        }
    }

    /**
     * Ajoute un objet dans la carte
     *
     * @param c Case que l'on veut ajouter à la carte
     */
    public void ajouterObjet(Case c) {
        carte[c.getX()][c.getY()] = c;
    }

    public Case[][] getCarte() {
        return carte;
    }

    public Case getCase(int x, int y) {
        return carte[x][y];
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

}
