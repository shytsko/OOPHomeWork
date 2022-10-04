package gb.HomeWork3.Task2;

import java.util.Comparator;

public class ComparatorPersonByAgeName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()==o2.getAge())
            return o1.getName().compareTo(o2.getName());
        else
            return Integer.compare(o1.getAge(), o2.getAge());
    }
}
