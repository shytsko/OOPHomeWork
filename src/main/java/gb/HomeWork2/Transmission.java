package gb.HomeWork2;

public class Transmission implements Checkable {
    private int grNumber;

    public void switchGear (int number) {
        this.grNumber = number;
        Log(String.format("Переключение скорости на %d", number));
    }

    public int getGrNumber() {
        return grNumber;
    }

    @Override
    public boolean Check() {
        Log("Коробка передач исправна");
        return true;
    }

    public void Log(String message) {
        System.out.println("Transmission: " + message);
    }
}
