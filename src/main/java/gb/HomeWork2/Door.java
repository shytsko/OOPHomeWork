package gb.HomeWork2;

public class Door implements Checkable {
    private String name;
    private boolean isOpen;
    private boolean blocked;

    public Door(String name) {
        this.name = name;
    }

    public void Open() {
        if(!blocked) {
            Log(String.format("%s дверь открыта", name));
            this.isOpen=true;
        }
    }

    public void Close() {
        Log(String.format("%s дверь закрыта", name));
        this.isOpen=false;
    }

    public void Block(){
        Log(String.format("%s дверь заблокирована", name));
        this.blocked=true;
    }

    public void Unlock(){
        Log(String.format("%s дверь разблокирована", name));
        this.blocked=false;
    }

    @Override
    public boolean Check() {
        Log(String.format("%s дверь исправна", name));
        return true;
    }

    public void Log(String message) {
        System.out.println("Door: " + message);
    }
}
