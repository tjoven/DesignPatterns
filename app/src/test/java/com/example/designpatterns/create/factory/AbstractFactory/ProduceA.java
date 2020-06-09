package com.example.designpatterns.create.factory.AbstractFactory;

import com.example.designpatterns.create.factory.FactoryPattern.Product;

public class ProduceA extends Product {
    @Override
    public void show() {
        System.out.println("生产产品A");
    }
}
