package StrategyDesignPattern.com;

public class Div implements Calculator{
    @Override
    public float calculation(float a, float b) {
        return a/b;
    }
}
