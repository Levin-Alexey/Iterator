import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    private final int min;
    private final int max;
    private final Random random;

    public RandomsIterator(int min, int max, Random random) {
        this.min = min;
        this.max = max;
        this.random = random;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min + 1) + min;
    }
}
