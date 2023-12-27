import java.util.Random;
import java.util.Scanner;

public class GuessingNum {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int maxAttempts = 5;
        int score = 0;

        while (true) {
            int secretNumber = r.nextInt(100) + 1;

            System.out.println("Round: " + (score + 1));

            for (int guess = 1; guess <= maxAttempts; guess++) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - guess));
            }

            System.out.println("Score: " + score);

            if (score == 5) {
                System.out.println("Congratulations! You've completed 5 rounds.");
                break;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing. Your final score is: " + score);
                break;
            }
        }
        scanner.close();

    }
}
