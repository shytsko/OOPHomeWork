package gb.HomeWork5.Calculator;

public class Main {
    public static void main(String[] args) {
         (new Presenter(new Model(), new ConsoleView())).Execute();
    }
}
