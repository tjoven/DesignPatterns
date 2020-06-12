package com.example.designpatterns.typeStructure.decorator;

public class Client {

    public static void main(String[] args) {
        NormalMan normalMan = new NormalMan("ww");
        ManCar car = new ManCar(normalMan);
        ManHouse house = new ManHouse(car);

        house.desc();
    }
}
