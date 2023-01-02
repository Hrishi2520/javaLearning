package StrategyDesignPattern.com;

public class Sub implements Calculator{
    @Override
    public float calculation(float a, float b) {
        return a - b;
    }
}
