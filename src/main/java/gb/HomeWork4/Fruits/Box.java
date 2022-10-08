package gb.HomeWork4.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box <F extends Fruit> {
    private List<F> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void Put(F fruit) {
        this.box.add(fruit);
    }

    public F Take() {
        F fruit = this.box.get(0);
        this.box.remove(0);
        return fruit;
    }

    public void Pour(Box<F> anotherBox) {
        while(!this.box.isEmpty())
            anotherBox.Put(this.Take());
    }

    public double GetWeight() {
        if (!this.box.isEmpty())
            return this.box.size() * this.box.get(0).weight();
        return 0;
    }

    public boolean Compare(Box<? extends Fruit> anotherBox) {
        return this.GetWeight() == anotherBox.GetWeight();
    }


}
