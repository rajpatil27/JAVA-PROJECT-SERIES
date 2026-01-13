import java.util.*;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playAgain = 1;

        while (playAgain == 1) {

            int randomNumber = rand.nextInt(100) + 1; // 1 to 100
            int guess = 0;
            int attempts = 0;

            System.out.println("\n--- Number Guessing Game ---");
            System.out.println("Guess a number between 1 and 100");

            while (guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too high!");
                } 
                else if (guess < randomNumber) {
                    System.out.println("Too low!");
                } 
                else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                }
            }

            System.out.print("\nPlay again? (1 = Yes, 0 = No): ");
            playAgain = sc.nextInt();
        }

        System.out.println("Game Over. Thanks for playing!");
        sc.close();
    }
}