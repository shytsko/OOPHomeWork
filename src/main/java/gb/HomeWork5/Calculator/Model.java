package gb.HomeWork5.Calculator;

import java.util.HashSet;
import java.util.Set;

public class Model {
    private double operand1;
    private double operand2;
    private String operator;

    private Set<String> operators;

    public Model() {
        this.operators = new HashSet<>(Set.of("+", "-", "*", "/"));
        this.operand1 = 0;
        this.operand2 = 0;
        this.operator = "+";
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Set<String> GetTrueOperators() {
        return operators;
    }

    public double Calculate() {
        switch (operator) {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": return operand1 / operand2;
            default: return 0;
        }
    }


}
