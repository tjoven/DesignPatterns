package com.example.designpatterns.typeCreate.factory.FactoryPattern;

import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.ProduceA;
import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.Product;

public class FactoryA extends Factory {

    public  Product create(){
        return new ProduceA();
    }
}
