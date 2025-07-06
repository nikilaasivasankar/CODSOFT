import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        int roundsPlayed = 0;
        int roundsWon = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Guess the Number Game!");
        while (playAgain) 
        {
            int randomNumber = random.nextInt(max - min + 1) + min;
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;
            roundsPlayed++;
            System.out.println("\nRound " + roundsPlayed + ":");
            System.out.println("Guess a number between " + min + " and " + max + ". You have " + maxAttempts + " attempts.");
            while (attemptsLeft > 0) 
            {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == randomNumber) 
                {
                    System.out.println("Correct! You guessed the number!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } 
                else if (guess < randomNumber) 
                {
                    System.out.println("Too low!");
                }
                else 
                {
                    System.out.println("Too high!");
                }
                attemptsLeft--;
                if (attemptsLeft > 0) 
                {
                    System.out.println("Attempts left: " + attemptsLeft);
                }
            }
            if (!guessedCorrectly) 
            {
                System.out.println("Out of attempts! The correct number was: " + randomNumber);
            }
            System.out.print("Do you want to play another round? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }
        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + roundsPlayed);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

/*OUTPUT
Welcome to the Guess the Number Game!

Round 1:
Guess a number between 1 and 100. You have 5 attempts.
Enter your guess: 52
Too high!
Attempts left: 4
Enter your guess: 25
Too high!
Attempts left: 3
Enter your guess: 63
Too high!
Attempts left: 2
Enter your guess: 21
Too high!
Attempts left: 1
Enter your guess: 20
Too high!
Out of attempts! The correct number was: 10
Do you want to play another round? (yes/no): no

Game Over!
Total rounds played: 1
Rounds won: 0
Thanks for playing! */




    
    
  
