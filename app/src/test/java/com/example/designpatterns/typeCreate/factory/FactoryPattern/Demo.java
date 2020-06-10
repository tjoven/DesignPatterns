package com.example.designpatterns.typeCreate.factory.FactoryPattern;


public class Demo {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.create().show();

        FactoryB factoryB = new FactoryB();
        factoryB.create().show();
    }
}
