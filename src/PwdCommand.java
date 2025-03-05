public class PwdCommand implements Command{
    @Override
    public void execute(String[] args){
<<<<<<< HEAD
        String path = (System.getProperty("user.dir"));
        System.out.println("\nPath\n----\n" + path + "\n");
    }
}
=======
        System.out.println(System.getProperty("user.dir"));
    }
}
>>>>>>> natan-branch
