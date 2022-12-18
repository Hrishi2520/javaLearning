public class Calculator {
    public Calculator(ICalculatorOperation calculatorOperation) {
        CalculatorOperation = calculatorOperation;
    }
    public ICalculatorOperation CalculatorOperation;

    public double Solve(double x, double y) {
        return CalculatorOperation.Calculate(x, y);
    }
}
