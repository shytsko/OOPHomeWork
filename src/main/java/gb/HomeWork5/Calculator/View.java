package gb.HomeWork5.Calculator;

import java.util.Set;

public interface View {
    public double GetOperand(String message, String errorMessage);
    public String GetOperator(String message, Set<String> trueOperators, String errorMessage);

    public void ViewMessage(String message);

    public void ShowResult(String result);
}
