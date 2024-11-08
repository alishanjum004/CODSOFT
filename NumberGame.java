import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int MaximumAttempts = 10;
        int NumberofRounds = 0;
        int Score = 0;
        String PlayAgain;
        do {
            int Guessingnumber = random.nextInt(100)+1;
            int Attempts = 0;
            boolean Guessednumber = false;
            System.out.println("Guess the number of your choice.");
            System.out.println("You have 10 attempts to guess the number");
            while(Attempts < MaximumAttempts)
            {
                System.out.println("Enter the number : ");
                int Usernumber = sc.nextInt();
                Attempts++;
                int Attemptsleft = MaximumAttempts - Attempts;
                System.out.println("Attempts left : "+ Attemptsleft);
                int Attemptsused = MaximumAttempts - Attemptsleft;
                if(Usernumber == Guessingnumber)
                {
                    System.out.println("Congratulations! You have guessed the correct number with in " + Attemptsused + " attempts");
                    Guessednumber = true;
                    Score += Attemptsleft+1;
                    break; 
                } else if(Usernumber > Guessingnumber){
                        System.out.println("Too High");
                }else {
                    System.out.println("Too Low");
                }
            }
            if(!Guessednumber) {
                System.out.println("Sorry, all attempts have completed.");
                System.out.println("The number is : "+Guessingnumber);
            }
            NumberofRounds++;
            System.out.println("Do you want to play again? (Yes/No) : ");
            PlayAgain = sc.next();
           }while(PlayAgain.equalsIgnoreCase("Yes"));
             System.out.println("Thank you for playing.");
             System.out.println("Number of rounds played : "+NumberofRounds);
             System.out.println("Total score is : "+Score);
            
        
    }
}
