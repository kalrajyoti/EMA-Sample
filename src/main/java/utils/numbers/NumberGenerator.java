package utils.numbers;

import java.util.Date;
import java.util.Random;

public class NumberGenerator {
    private final Random random;

    public NumberGenerator(Random randomSeed) {
        this.random = randomSeed;
    }

    public Integer randomInt(Integer maxNum) {
        return random.nextInt(maxNum);
    }

    public Integer randomIntBetween(int min, int max) {
        return random.nextInt(min, max);
    }

    public static String timeStamp() {
        return String.valueOf(new Date().getTime());
    }
}
