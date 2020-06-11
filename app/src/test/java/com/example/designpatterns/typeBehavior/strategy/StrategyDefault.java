package com.example.designpatterns.typeBehavior.strategy;


public class StrategyDefault implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略 StrategyDefault");
    }
}
