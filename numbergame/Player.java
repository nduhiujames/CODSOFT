package numbergame;

import java.util.Scanner;

public class Player {
    private int guess;
    private int attempts;

    public int takeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    public void compareGuess(int userGuess, int targetNumber) {
        attempts++;
        if (userGuess == targetNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
            System.out.println("Attempts: " + attempts);
        } else if (userGuess < targetNumber) {
            System.out.println("Your guess is too low. Try again.");
        } else {
            System.out.println("Your guess is too high. Try again.");
        }
    }
}
