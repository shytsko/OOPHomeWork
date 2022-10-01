package gb.HomeWork2;

public class Wheel implements Checkable, Repairable {
    private String name;
    boolean properly;

    public Wheel(String name) {
        this.name = name;
        this.properly = true;
    }

    public void rotate() {
        Log(String.format("%s колесо крутится", this.name));
    }

    @Override
    public boolean Check() {
        if(this.properly)
            Log(String.format("%s колесо исправно", this.name));
        else
            Log(String.format("!!!%s колесо не исправно!!!", this.name));
        return this.properly;
    }



    public void Log(String message) {
        System.out.println("Wheel: " + message);
    }

    @Override
    public void Repair() {
        if(!this.properly) {
            Log(String.format("%s колесо отремонтировано", this.name));
            this.properly = true;
        }
        else
            Log(String.format("Ремонт колеса %s не требуется", this.name));
    }
}
