//1. Написать итератор, который будет выдавать N случайных целых чисел

package gb.HomeWork3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        MyRandom myRandom = new MyRandom(10, 100);
        myRandom.forEach(randomList::add);
        System.out.println(randomList);
    }


}
