import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        // Create Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        // Prompt the user for a guess
        System.out.print("Guess a number between 1 and 100: ");
        int userGuess = scanner.nextInt();

        // Display the user's guess
        System.out.println("You guessed: " + userGuess);

        // Compute and display the difference between the guess and the actual number
        int difference = Math.abs(number - userGuess);
        System.out.println("The correct number was: " + number);
        System.out.println("The difference between your guess and the actual number is: " + difference);
    }
}