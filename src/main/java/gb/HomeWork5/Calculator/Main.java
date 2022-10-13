package gb.HomeWork5.Calculator;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        int o1=view.GetIntOperand("Введите операнд 1: ", "Не верное значение");
    }
}
