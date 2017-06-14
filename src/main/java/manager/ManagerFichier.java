package manager;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de gestion des fichiers
 *
 * @author Laurent Mourer
 */
public class ManagerFichier {

    List<String> lignes;

    public ManagerFichier(String fichier) {

        Path file = FileSystems.getDefault().getPath(fichier);

        try {
            lignes = Files.readAllLines(FileSystems.getDefault().getPath(fichier), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(ManagerFichier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<String> getLignes() {
        return lignes;
    }

    public void setLignes(List<String> lignes) {
        this.lignes = lignes;
    }

}
