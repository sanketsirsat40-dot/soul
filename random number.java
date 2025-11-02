import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // random number between 1-100
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guess Game ===");
        System.out.println("Guess a number between 1 to 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too High! Try again.");
            } else if (guess < target) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed correct number.");
                System.out.println("Attempts used: " + attempts);
            }

        } while (guess != target);

        sc.close();
    }
}
