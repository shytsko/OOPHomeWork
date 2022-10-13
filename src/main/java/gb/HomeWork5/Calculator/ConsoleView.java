package gb.HomeWork5.Calculator;

import java.util.Scanner;

public class ConsoleView implements View {
    @Override
    public int GetIntOperand(String message, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            if(scanner.hasNextInt())
                return scanner.nextInt();
            else {
                scanner.next();
                System.out.println(errorMessage);
            }
        }
    }

    @Override
    public void ViewMessage(String message) {
        System.out.println(message);
    }
}
