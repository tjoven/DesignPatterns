package com.example.designpatterns.create.factory.AbstractFactory;

import com.example.designpatterns.create.factory.SimpleFactoryPattern.Product;

public abstract class Factory {

    public abstract Product createProductA();
    public abstract Product createProductB();
}
