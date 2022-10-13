package gb.HomeWork5.Calculator;

import java.util.Scanner;
import java.util.Set;

public class ConsoleView implements View {
    @Override
    public double GetOperand(String message, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            if(scanner.hasNextDouble())
                return scanner.nextDouble();
            else {
                scanner.next();
                System.out.println(errorMessage);
            }
        }
    }

    @Override
    public String GetOperator(String message, Set<String> trueOperators, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.next();
            if(trueOperators.contains(input))
                return input;
            else
                System.out.println(errorMessage);
        }
    }

    @Override
    public void ViewMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void ShowResult(String result) {
        System.out.println(result);
    }
}
