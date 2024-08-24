import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Значение min больше значения max!");
        }
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public int getRandom(int min, int max) {
        return random.nextInt(max - min) + min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandom(min, max);
            }
        };
    }
}
