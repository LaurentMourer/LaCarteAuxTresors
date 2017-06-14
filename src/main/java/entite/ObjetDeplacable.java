package entite;

/**
 * Classe de gestion des objets deplacable
 *
 * @author Laurent Mourer
 */
public class ObjetDeplacable implements Cloneable {

    private int x;
    private int y;
    private String orientation;
    private char[] sequence;

    public ObjetDeplacable(int x, int y, String orientation, String sequence) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.sequence = new char[sequence.length()];
        this.sequence = sequence.toCharArray();
    }

    public void avancer() {
        if (this.orientation.equalsIgnoreCase("N")) {
            this.y -= 1;
        }
        if (this.orientation.equalsIgnoreCase("S")) {
            this.y += 1;
        }
        if (this.orientation.equalsIgnoreCase("E")) {
            this.x += 1;
        }
        if (this.orientation.equalsIgnoreCase("O")) {
            this.x -= 1;
        }
    }

    public void droite() {
        if (this.orientation.equalsIgnoreCase("N")) {
            this.orientation = "E";
        } else if (this.orientation.equalsIgnoreCase("S")) {
            this.orientation = "O";
        } else if (this.orientation.equalsIgnoreCase("E")) {
            this.orientation = "S";
        } else if (this.orientation.equalsIgnoreCase("O")) {
            this.orientation = "N";
        }
    }

    public void gauche() {
        if (this.orientation.equalsIgnoreCase("N")) {
            this.orientation = "O";
        } else if (this.orientation.equalsIgnoreCase("S")) {
            this.orientation = "E";
        } else if (this.orientation.equalsIgnoreCase("E")) {
            this.orientation = "N";
        } else if (this.orientation.equalsIgnoreCase("O")) {
            this.orientation = "S";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObjetDeplacable other = (ObjetDeplacable) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    @Override
    public String toString() {
        return this.x + " - " + y + " - " + this.orientation;
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

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public char[] getSequence() {
        return sequence;
    }

    public void setSequence(char[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public ObjetDeplacable clone() throws CloneNotSupportedException {
        ObjetDeplacable copie = (ObjetDeplacable) super.clone();

        copie.sequence = new char[sequence.length];
        System.arraycopy(sequence, 0, copie.sequence, 0, sequence.length);
        return copie;
    }

}
