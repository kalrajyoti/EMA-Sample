package utils.strings;

import com.mifmif.common.regex.Generex;

import java.util.Random;

public class StringGenerator {
    private final Random random;

    public StringGenerator(Random randomSeed) {
        this.random = randomSeed;
    }
    public String alphaNumeric(int length) {
        return new Generex("[a-zA-Z0-9]{" + length + "}").random();
    }

    public String alphaOnly(int length) {
        return new Generex("[a-zA-Z]{" + length + "}").random();
    }
}
