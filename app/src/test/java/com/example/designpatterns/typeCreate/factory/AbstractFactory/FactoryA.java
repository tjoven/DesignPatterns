package com.example.designpatterns.typeCreate.factory.AbstractFactory;

import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.ProduceA;
import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.Product;

public class FactoryA extends Factory {


    @Override
    public Product createProductA() {
        return new ProduceA();
    }

    @Override
    public Product createProductB() {
        return new ProduceB();
    }
}
