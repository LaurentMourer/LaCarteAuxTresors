package manager;

import java.io.IOException;
import java.net.URISyntaxException;
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
     * @param fichier nom du fichier qui se situe dans le repertoire ressource
     */
    public void lireFichier(String fichier) {
        try {
            Path path = Paths.get(ClassLoader.getSystemResource(fichier).toURI());
            lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(GestionFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Methode qui lit un fichier
     *
     * @param fichier nom du fichier qui se situe dans le repertoire ressource
     * du projet
     * @param liste liste de ligne à écrire dans le fichier
     */
    public void ecrireFichier(String fichier, List<String> liste) {
        try {
         
            Path path = Paths.get("src/main/resources/sortie.txt");
            //Path path = Paths.get(ClassLoader.getSystemResource(fichier).toURI());
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
