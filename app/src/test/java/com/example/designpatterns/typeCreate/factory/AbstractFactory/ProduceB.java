package com.example.designpatterns.typeCreate.factory.AbstractFactory;

import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.Product;

public class ProduceB extends Product {
    @Override
    public void show() {
        System.out.println("生产产品B");
    }
}
