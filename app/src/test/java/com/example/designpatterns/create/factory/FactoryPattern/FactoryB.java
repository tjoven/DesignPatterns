package com.example.designpatterns.create.factory.FactoryPattern;

import com.example.designpatterns.create.factory.SimpleFactoryPattern.Product;

public class FactoryB extends Factory {

    public  Product create(){
        return new ProduceB();
    }
}
