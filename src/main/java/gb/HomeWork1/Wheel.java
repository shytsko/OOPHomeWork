package gb.HomeWork1;

public class Wheel {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void rotate() {
        System.out.printf("%s колесо крутится%n", this.name);
    }
}
