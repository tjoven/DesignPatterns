package com.example.designpatterns.strategy;

public class Demo {

    public static void main(String[] args) {
        StrategySelect.getStrategy("A").doSomething();
        StrategySelect.getStrategy("B").doSomething();
        StrategySelect.getStrategy("C").doSomething();
    }
}
