package gb.HomeWork2;

public class Сonditioner implements Checkable {
    public void On() {
        Log("Кондиционер включен");
    }

    public void Off() {
        Log("Кондиционер выключен");
    }

    @Override
    public boolean Check() {
        Log("Кондиционер исправен");
        return true;
    }

    public void Log(String message) {
        System.out.println("Сonditioner: " + message);
    }
}
