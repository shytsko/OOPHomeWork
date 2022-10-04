package gb.HomeWork3.Task2;


public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person o) {
        if(!this.name.equals(o.name))
            return this.name.compareTo(o.name);
        else if (this.age != o.age)
            return Integer.compare(this.age, o.age);
        else if (this.height != o.height)
            return Integer.compare(this.height, o.height);
        else
            return Integer.compare(this.weight, o.weight);
    }
}
