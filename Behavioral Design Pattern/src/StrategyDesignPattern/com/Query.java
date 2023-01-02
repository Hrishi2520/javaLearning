package StrategyDesignPattern.com;

public class Query {
    private Calculator calci;
    public Query(Calculator calci) {
        this.calci = calci;
    }
    public float executeStrategy(float num1, float num2) {
        return calci.calculation(num1, num2);
    }
}
