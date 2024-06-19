package utils.booleans;

import com.github.javafaker.Faker;


public class BooleanGenerator {
    private Faker faker;

    public BooleanGenerator() {
        this.faker = new Faker();
    }

    public static boolean generateRandom() {
        BooleanGenerator booleanGenerator = new BooleanGenerator();
        return booleanGenerator.faker.random().nextBoolean();

    }
}
