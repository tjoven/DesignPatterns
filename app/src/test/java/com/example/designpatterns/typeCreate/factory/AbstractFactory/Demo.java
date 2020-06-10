package com.example.designpatterns.typeCreate.factory.AbstractFactory;

public class Demo {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createProductA().show();
        factoryA.createProductB().show();
    }
}
