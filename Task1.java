//Number Game
import java.util.*;
class Task1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        while (true)
        {
            System.out.println("Enter the number of rounds you want to play:");
            int rounds=sc.nextInt();
            int score=0;
            for(int i=0;i<rounds;i++) 
            {
                int random=1+rand.nextInt(100); //to generate random number between 1 and 100
                System.out.println("Enter your guess:");
                int guess=sc.nextInt(); //for user to enter his guessed number
                //feedback on whether the guess is correct, too high, or too low
                if(guess==random) 
                {
                    System.out.println("You guessed it right");
                    score++;
                } 
                else if (guess>random) 
                {
                    System.out.println("Your guess is too high");
                } 
                else 
                {
                    System.out.println("Your guess is too low");
                }
            }
            System.out.println("Your score is " + score);
            //option for multiple rounds, allowing the user to play again
            System.out.println("Do you want to play again? (yes/no)");
            sc.nextLine();
            String playAgain = sc.nextLine();
            if (!playAgain.equals("yes")) 
            {
                break;
            }
        }
        sc.close();
        System.out.println("Thank you for playing!");
    }
}

          
