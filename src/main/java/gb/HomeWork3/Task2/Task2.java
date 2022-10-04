// Для класса Peroson, рассмотренного на уроке написать миниму три реализации интерфейса Comparable,
// которые будут сортровать набор экземпляров класса Person по разным наборам полей

package gb.HomeWork3.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Пупкин", 60, 170, 80));
        persons.add(new Person("Сидоров", 35, 175, 83));
        persons.add(new Person("Иванов", 55, 160, 100));
        persons.add(new Person("Гейтс", 60, 170, 60));
        persons.add(new Person("Шурпик", 40, 170, 75));
        persons.add(new Person("Незнайка", 60, 50, 20));
        persons.add(new Person("Иванов", 20, 200, 100));
        persons.add(new Person("Пупкин", 60, 170, 150));
        persons.add(new Person("Пупкин", 20, 170, 150));

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\n--------------------- Sort");
        Collections.sort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\n--------------------- Sort by Height-Weight");
        persons.sort(new ComparatorPersonByHeightWeight());
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("\n--------------------- Sort by Age-Name");
        persons.sort(new ComparatorPersonByAgeName());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
