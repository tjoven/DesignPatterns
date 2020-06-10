package com.example.designpatterns.typeCreate.factory.SimpleFactoryPattern;

public class Demo {

    public static void main(String[] args) {
        Factory.create("A").show();
        Factory.create("B").show();
    }
}
