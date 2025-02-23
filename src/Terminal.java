import java.util.Scanner;

public class Terminal{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        CommandHandler commandHandler = new CommandHandler();

        System.out.println("Terminal Simulado - Digite um Comando");

        while(true){
            System.out.print(System.getProperty("user.dir"));
            System.out.print(">");
            String ent = leia.nextLine();

            if(ent.isEmpty()){
                continue;
            }

            if(ent.equals("exit")){
                break;
            }

            commandHandler.executeCommand(ent);
        }
        leia.close();
    }
}