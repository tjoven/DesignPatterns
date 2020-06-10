package com.example.designpatterns.typeCreate.factory.AbstractFactory;

import com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern.Product;

public abstract class Factory {

    public abstract Product createProductA();
    public abstract Product createProductB();
}
