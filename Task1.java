/* 
    Task1 :- 
    Number Game. 
*/ 

import java.util.*; 
public class Task1 
{
    // Generating a Random Number using In-Built Function. 

    public static int randomValue(int minValue, int maxValue) 
    {
        return (int) (Math.random() * (maxValue - minValue) + 1); 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int currentAttempt; 
        int maximumAttempt = 10; 
        int totalScore = 0; 
        boolean playAgain = true; 
        int wonScore  = 0; 
        while (playAgain) 
        {
            // Getting the Range from the User. 

            System.out.println("Enter the Minimum Value : ");
            int minValue = sc.nextInt();
            System.out.println("Enter the Maximum Value : ");
            int maxValue = sc.nextInt();
            int randomValue = randomValue(minValue, maxValue);
            currentAttempt = 0;
            
            // Displaying Feedback based on the user's guess. 

            while ((currentAttempt < maximumAttempt) && (playAgain)) 
            {
                System.out.println("Enter your Guessed Value : ");
                int guessedValue = sc.nextInt();
                currentAttempt++;
                if (guessedValue == randomValue)
                {
                    System.out.println("Your Guess is Correct");
                    wonScore++;
                    totalScore += wonScore + currentAttempt;
                    break;
                }
                else if (guessedValue < randomValue) 
                { 
                    System.out.println("Your Guess is Too Low"); 
                    System.out.println("Remaining Attempts : " + (maximumAttempt - currentAttempt));
                } 
                else if (guessedValue > randomValue) 
                {
                    System.out.println("Your Guess is Too High"); 
                    System.out.println("Remaining Attempts : " + (maximumAttempt - currentAttempt)); 
                }
                else 
                { 
                    System.out.println("Oops!... You didn't guess it. ");
                    System.out.println("The Generated Random Value is : " + randomValue);
                    break;
                }
                totalScore += wonScore; 
            } 

            // Querying from the user to play again. 

            System.out.println("Do you want to play again! (Y/N)"); 
            playAgain = sc.next().equalsIgnoreCase("Y"); 
            System.out.println("Total Score Obtained : " + totalScore); 
            if (!playAgain) 
            {
                sc.close(); 
                System.out.println("Thanks for your visit :) ");
                System.out.println("Visit us Again! ");
                System.exit(0);  
            }
        } 
    } 
} 