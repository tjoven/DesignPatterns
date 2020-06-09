package com.example.designpatterns.create.factory.SimpleFactoryPattern;

public class Factory {

    public static Product create(String flag){
        switch (flag){
            case "A":
                return new ProduceA();
            case "B":
                return new ProduceB();
        }
        return null;
    }
}
