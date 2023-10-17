package numbergame;
import java.util.Random;

public class Game implements IGame {
    private Random random = new Random();

    @Override
    public int generateRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}