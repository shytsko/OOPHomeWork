package gb.HomeWork5.Calculator;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void Execute() {
        model.setOperand1(view.GetOperand("Operand 1: ", "Invalid operand"));
        model.setOperator(view.GetOperator("Operator: ", model.GetSupportOperators(), "Invalid operand"));
        model.setOperand2(view.GetOperand("Operand 2: ", "Invalid operand"));
        view.ShowResult(Double.toString(model.Calculate()));
    }
}
