import java.io.File;

public class DirectoryManager {
    public boolean createDirectory(String nome) {
        try {
            File dir = new File(System.getProperty("user.dir") + "/" + nome);
            if (dir.mkdir()) {
                System.out.println("Diretorio criado: " + dir.getAbsolutePath());
                return true;
            } else {
                System.out.println("O diretorio já existe.");
                return false;
            }
        } catch(Exception e) {
            return false;
        }
    }

    public boolean changeDirectory(String caminho) {
        File entraDir = new File(caminho);
        
        if (entraDir.exists() && entraDir.isDirectory()) {
            System.setProperty("user.dir", entraDir.getAbsolutePath());
            System.out.println("Diretório alterado para: " + entraDir.getAbsolutePath());
            return true;
        } else {
            System.out.println("Diretório inválido: " + caminho);
            return false;
        }
    }
}