package utils.collections;

import utils.numbers.NumberGenerator;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class CollectionRandomizer {
    private final Random random;

    public CollectionRandomizer(Random randomSeed) {
        this.random = randomSeed;
    }

    public <T> T randomFromList(List<T> list) {
        Objects.requireNonNull(list);
        return list.isEmpty() ? null : list.get(new NumberGenerator(random).randomInt(list.size()));
    }
}
