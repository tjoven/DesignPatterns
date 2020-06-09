package com.example.designpatterns.create.factory.FactoryPattern;

import com.example.designpatterns.create.factory.SimpleFactoryPattern.ProduceA;
import com.example.designpatterns.create.factory.SimpleFactoryPattern.Product;

public class FactoryA extends Factory {

    public  Product create(){
        return new ProduceA();
    }
}
