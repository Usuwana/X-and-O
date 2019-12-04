import java.util.*;

class Game 
{
    final String board[][] = new String[3][3];
    final String player1 = "X";
    final String player2 = "O";
    
    

    public Game()
    {
        for(int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                board[i][j] = " ";
            }
        }
    }

    public void display()
    {
        System.out.println("     0   1   2");
        System.out.println("  ================");
        System.out.println("0 || " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ||");
        System.out.println("  ---------------- ");
        System.out.println("1 || " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ||");
        System.out.println("  ---------------- ");
        System.out.println("2 || " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ||");
        System.out.println("  ================");
    }

    public void play() 
    {
        int x = 0;
        int y = 0;
        int match = 1;
        while ((match != 3) && (match != 0))
        {
          
                   if ((match != 3) && (match != 0))
                   {
                    do
                    {
                        display();
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Player 1 enter unoccupied coordinates");
                        System.out.println("Player 1 enter x coordinates: ");
                        x = sc.nextInt();
                        System.out.println("Player 1 enter y coordinates: ");
                        y = sc.nextInt();

                    }while( board[x][y] != " ");
                    board[x][y] = player1;
                    display();
                    
                            if (((board[0][0] == player1) && (board[0][1] == player1) && (board[0][2] == player1)) || ((board[0][0] == player1) && (board[1][1] == player1) && (board[2][2] == player1)) || ((board[0][1] == player1) && (board[1][1] == player1) && (board[2][1] == player1)) || ((board[0][2] == player1) && (board[1][2] == player1) && (board[2][2] == player1)) || ((board[0][0] == player1) && (board[1][0] == player1) && (board[2][0] == player1)) || ((board[2][0] == player1) && (board[1][1] == player1) && (board[0][2] == player1)) || ((board[1][0] == player1) && (board[1][1] == player1) && (board[1][2] == player1)) || ((board[2][0] == player1) && (board[2][1] == player1) && (board[2][2] == player1)))
                            {
                                match = 3;
                                System.out.println("Player 1 wins");
                                for(int i = 0; i<3; i++)
                                {
                                     for (int j = 0; j<3; j++)
                                     {
                                        board[i][j] = " ";
                                    }
                                }
                            } 

                   else if (board[0][0] != " ")
                    {
                        if (board[1][0] != " ")
                        {
                            if (board[2][0] != " ")
                            {
                                if (board[0][1] != " ")
                                {
                                    if (board[1][1] != " ")
                                    {
                                        if (board[2][1] != " ")
                                        {
                                            if (board[0][2] != " ")
                                            {
                                                if (board[1][2] != " ")
                                                {
                                                    if (board[2][2] != " ")
                                                    {
                                                        System.out.println("All spaces filled, no winner!");
                                                        match = 0;
                                                        for(int i = 0; i<3; i++)
                                                        {
                                                            for (int j = 0; j<3; j++)
                                                            {
                                                                board[i][j] = " ";
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                   } 

                   
                      
                    if ((match != 3) && (match != 0))
                    {
                        do
                        {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Player 2 enter unoccupied coordinates");
                            System.out.println("Player 2 enter x coordinates: ");
                            x = sc1.nextInt();
                            System.out.println("Player 2 enter y coordinates: ");
                            y = sc1.nextInt();
    
                        }while( board[x][y] != " ");
                        board[x][y] = player2;
                        display();
    
                        if (((board[0][0] == player2) && (board[0][1] == player2) && (board[0][2] == player2)) || ((board[0][0] == player2) && (board[1][1] == player2) && (board[2][2] == player2)) || ((board[0][1] == player2) && (board[1][1] == player2) && (board[2][1] == player2)) || ((board[0][2] == player2) && (board[1][2] == player2) && (board[2][2] == player2)) || ((board[0][0] == player2) && (board[1][0] == player2) && (board[2][0] == player2)) || ((board[2][0] == player2) && (board[1][1] == player2) && (board[0][2] == player2)) || ((board[1][0] == player2) && (board[1][1] == player2) && (board[1][2] == player2)) || ((board[2][0] == player2) && (board[2][1] == player2) && (board[2][2] == player2)))
                        {
                                match = 3;
                                System.out.println("Player 2 wins");
                                for(int i = 0; i<3; i++)
                                {
                                    for (int j = 0; j<3; j++)
                                    {
                                        board[i][j] = " ";
                                    }
                                }
                        } 

                       else if (board[0][0] != " ")
                        {
                        if (board[1][0] != " ")
                        {
                            if (board[2][0] != " ")
                            {
                                if (board[0][1] != " ")
                                {
                                    if (board[1][1] != " ")
                                    {
                                        if (board[2][1] != " ")
                                        {
                                            if (board[0][2] != " ")
                                            {
                                                if (board[1][2] != " ")
                                                {
                                                    if (board[2][2] != " ")
                                                    {
                                                        System.out.println("All spaces filled, no winner!");
                                                        match = 0;
                                                        for(int i = 0; i<3; i++)
                                                        {
                                                            for (int j = 0; j<3; j++)
                                                            {
                                                                board[i][j] = " ";
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }


                    }

                   
        }

    }
}