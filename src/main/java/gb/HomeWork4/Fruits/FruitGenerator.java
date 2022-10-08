package gb.HomeWork4.Fruits;

import java.util.Iterator;
import java.util.Random;

public class FruitGenerator implements Iterable<Fruit> {

    private int count;

    public FruitGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Fruit> iterator() {
        return new Iterator<Fruit>() {
            private int fruitLeft = count;
            Random rnd = new Random();
            @Override
            public boolean hasNext() {
                return fruitLeft>0;
            }

            @Override
            public Fruit next() {
                fruitLeft--;
                if (rnd.nextBoolean()) {
                    return new Apple();
                } else {
                    return new Orange();
                }
            }
        };
    }
}
