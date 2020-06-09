package com.example.designpatterns.create.factory.AbstractFactory;

import com.example.designpatterns.create.factory.SimpleFactoryPattern.Product;

public class ProduceB extends Product {
    @Override
    public void show() {
        System.out.println("生产产品B");
    }
}
