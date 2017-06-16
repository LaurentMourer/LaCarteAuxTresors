package manager;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de gestion des fichiers
 *
 * @author Laurent Mourer
 */
public class GestionFichier {

    private List<String> lignes;

    public GestionFichier() {

    }

    /**
     * Methode qui écrit dans un fichier
     *
     */
    public void lireFichier() {
        Path path = Paths.get("C:/Users/pbyw529/Desktop/LaCarteAuxTresors/target/classes/test.txt");
        try {
            lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(GestionFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Methode qui lit un fichier
     *
     */
    public void ecrireFichier(String fichier, List<String> liste) {
        Path path = Paths.get("C:/Users/pbyw529/Desktop/LaCarteAuxTresors/target/classes/test2.txt");

        try {
            Files.write(path, liste, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(GestionFichier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<String> getLignes() {
        return lignes;
    }

    public void setLignes(List<String> lignes) {
        this.lignes = lignes;
    }

}
