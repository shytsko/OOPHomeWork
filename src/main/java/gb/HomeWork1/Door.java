package gb.HomeWork1;

public class Door {
    private String name;
    private boolean isOpen;
    private boolean blocked;

    public Door(String name) {
        this.name = name;
    }

    public void Open() {
        if(!blocked) {
            System.out.printf("%s дверь открыта%n", name);
            this.isOpen=true;
        }
    }

    public void Close() {
        System.out.printf("%s дверь закрыта%n", name);
        this.isOpen=false;
    }

    public void Block(){
        System.out.printf("%s дверь заблокирована%n", name);
        this.blocked=true;
    }

    public void Unlock(){
        System.out.printf("%s дверь разблокирована%n", name);
        this.blocked=false;
    }
}
