package com.example.designpatterns.typeBehavior.strategy;


public class StrategyA implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略 StrategyA");
    }
}
