import java.util.Scanner;
<<<<<<< HEAD

public class Terminal{
    public static void main(String[] args){
=======
public class Terminal {

    public static void main(String[] args) {
>>>>>>> natan-branch
        Scanner leia = new Scanner(System.in);
        CommandHandler commandHandler = new CommandHandler();

        System.out.println("Terminal Simulado - Digite um Comando");

        while(true){
            System.out.print(System.getProperty("user.dir"));
            System.out.print(">");
            String ent = leia.nextLine();
<<<<<<< HEAD
            if(ent.isEmpty()){
                continue;
            }
=======

            if(ent.isEmpty()){
                continue;
            }

>>>>>>> natan-branch
            if(ent.equals("exit")){
                break;
            }

            commandHandler.executeCommand(ent);
        }
        leia.close();
    }
}