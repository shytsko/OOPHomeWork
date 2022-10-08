//a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
//   поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес
//   одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
//   которую подадут в compare в качестве параметра, true - если их веса равны, false в противном
//   случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
//   (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
//   соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
//   которые были в этой коробке;
//g. Не забываем про метод добавления фрукта в коробку.

package gb.HomeWork4;

import gb.HomeWork4.Fruits.*;

public class Run {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        for (Fruit fruit: new FruitGenerator(20)) {
            if (fruit instanceof Orange)
                orangeBox.Put((Orange) fruit);
            else if (fruit instanceof Apple)
                appleBox.Put((Apple) fruit);
//            System.out.println("Put " + fruit);
        }

        System.out.println("Orange box weight: " + orangeBox.GetWeight());
        System.out.println("Apple box weight: " + appleBox.GetWeight());
        if(orangeBox.Compare(appleBox))
            System.out.println("Weights are equal");
        else
            System.out.println("Weights are not equal");

        Box<Orange> newOrangeBox = new Box<>();
        Box<Apple> newAppleBox = new Box<>();
        orangeBox.Pour(newOrangeBox);
        appleBox.Pour(newAppleBox);

        System.out.println("Orange box weight: " + orangeBox.GetWeight());
        System.out.println("New orange box weight: " + newOrangeBox.GetWeight());
        System.out.println("Apple box weight: " + appleBox.GetWeight());
        System.out.println("New apple box weight: " + newAppleBox.GetWeight());
    }
}
