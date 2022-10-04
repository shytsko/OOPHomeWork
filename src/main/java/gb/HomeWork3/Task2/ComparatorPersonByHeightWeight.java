package gb.HomeWork3.Task2;

import java.util.Comparator;

public class ComparatorPersonByHeightWeight implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getHeight()==o2.getHeight())
            return Integer.compare(o1.getWeight(), o2.getWeight());
        else
            return Integer.compare(o1.getHeight(), o2.getHeight());
    }
}
