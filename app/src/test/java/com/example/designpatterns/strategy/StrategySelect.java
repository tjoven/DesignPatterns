package com.example.designpatterns.strategy;

public class StrategySelect implements Strategy{
    private static Strategy strategy = new StrategyDefault();

    public static Strategy getStrategy(String plan){
        switch (plan){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            default:
                strategy = new StrategyDefault();
                break;
        }
        return strategy;
    }

    @Override
    public void doSomething() {
        strategy.doSomething();
    }
}
