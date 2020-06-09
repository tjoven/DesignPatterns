package com.example.designpatterns.create.factory.AbstractFactory;

import com.example.designpatterns.create.factory.SimpleFactoryPattern.ProduceA;
import com.example.designpatterns.create.factory.SimpleFactoryPattern.Product;

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
