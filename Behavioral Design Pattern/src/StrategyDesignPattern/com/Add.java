package StrategyDesignPattern.com;

public class Add implements Calculator{
    @Override
    public float calculation(float a, float b) {
        return a + b;
    }
}
