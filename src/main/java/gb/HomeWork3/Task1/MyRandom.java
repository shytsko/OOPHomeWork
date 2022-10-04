package gb.HomeWork3.Task1;

import java.util.Iterator;
import java.util.Random;

public class MyRandom implements Iterable<Integer> {
    private int count;
    private int bound;

    public MyRandom(int count, int bound) {
        this.count = count;
        this.bound = bound;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i = count;
            private Random rnd = new Random();

            @Override
            public boolean hasNext() {
                return i>0;
            }

            @Override
            public Integer next() {
                i--;
                return rnd.nextInt(bound);
            }
        };
    }
}
