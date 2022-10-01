package gb.HomeWork2;

public class Сonditioner implements Checkable, Repairable {
    boolean properly;

    public Сonditioner() {
        this.properly = false;
    }

    public void On() {
        Log("Кондиционер включен");
    }

    public void Off() {
        Log("Кондиционер выключен");
    }

    @Override
    public boolean Check() {
        if(this.properly)
            Log("Кондиционер исправен");
        else
            Log("!!!Кондиционер не исправен!!!");
        return properly;
    }

    @Override
    public void Repair() {
        if(!this.properly) {
            Log("Кондиционер отремонтирован");
            this.properly = true;
        }
        else
            Log("Ремонт кондиционера не требуется");
    }

    public void Log(String message) {
        System.out.println("Сonditioner: " + message);
    }
}
