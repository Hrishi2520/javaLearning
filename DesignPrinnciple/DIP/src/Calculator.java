public class Calculator {
    public Calculator(ICalculatorOperation calculatorOperation) {
        this.calculatorOperation = calculatorOperation;
    }
    public ICalculatorOperation calculatorOperation;

    public double Solve(double x, double y) {
        return calculatorOperation.Calculate(x, y);
    }
}
