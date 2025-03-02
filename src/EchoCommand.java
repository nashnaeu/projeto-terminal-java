import java.io.*;

public class EchoCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: echo \"<texto>\" <arquivo>");
            return;
        }

        // Concatenar todos os argumentos do texto ignorando o nome do arquivo
        StringBuilder texto = new StringBuilder();
        for (int i = 1; i < args.length - 1; i++) { 
            texto.append(args[i]).append(" ");
        }

        File escreve = new File(args[args.length - 1]);

        try (FileWriter escritor = new FileWriter(escreve, true)) { // true = modo append
            escritor.write(texto.toString().trim() + "\n"); // Remover espaço final e pular linha
            System.out.println("Texto adicionado ao arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
