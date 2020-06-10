package com.example.designpatterns.typeCreate.factory.FactoryPattern;

import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.Product;

public class FactoryB extends Factory {

    public  Product create(){
        return new ProduceB();
    }
}
