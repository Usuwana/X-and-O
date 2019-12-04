import java.util.*;

class Run
{
    public static void main(String[] args)
    {
        Game theGame = new Game();

        //theGame.display();
        //theGame.play();

        int choice = 0;
        while (choice != 2)
        {
            System.out.println("\nWELCOME TO TIC-TAC-TOE!\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Start new game");
            System.out.println("2. Exit\n");
            System.out.println("Please select an option: ");
            choice = sc.nextInt();
    
            switch(choice)
            {
                case 1:
                    theGame.play();
                break;
                case 2:
                break;
            }
        }
       
    }
}