package gb.HomeWork2;

public class Wheel implements Checkable {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void rotate() {
        Log(String.format("%s колесо крутится", this.name));
    }

    @Override
    public boolean Check() {
        Log(String.format("%s колесо исправно", this.name));
        return true;
    }

    public void Log(String message) {
        System.out.println("Wheel: " + message);
    }
}
