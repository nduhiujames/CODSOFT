package numbergame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int wins = 0;

        while (true) {
            int targetNumber = game.generateRandomNumber(min, max);
            int attempts = 0;
            boolean roundWon = false;
            System.out.println("Round " + (rounds + 1) + " - Guess the number between " + min + " and " + max);

            while (attempts < maxAttempts) {
                int userGuess = player.takeGuess();
                player.compareGuess(userGuess, targetNumber);
                attempts++;

                if (userGuess == targetNumber) {
                    roundWon = true;
                    break;
                }
            }

            if (roundWon) {
                wins++;
                System.out.println("Round " + (rounds + 1) + " won in " + attempts + " attempts!");
            } else {
                System.out.println("Round " + (rounds + 1) + " lost. The correct number was: " + targetNumber);
            }

            System.out.println("Total rounds played: " + (rounds + 1));
            System.out.println("Total rounds won: " + wins);

            System.out.print("Play again? (yes/no): ");
            try (Scanner scanner = new Scanner(System.in)) {
                String playAgain = scanner.next().toLowerCase();

                if (!playAgain.equals("yes")) {
                    break;
                }
            }
            rounds++;
        }
    }
}
