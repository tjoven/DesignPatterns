package com.example.designpatterns.typeCreate.factory.AbstractFactory;

import com.example.designpatterns.typeCreate.factory.FactoryPattern.Product;

public class ProduceA extends Product {
    @Override
    public void show() {
        System.out.println("生产产品A");
    }
}
