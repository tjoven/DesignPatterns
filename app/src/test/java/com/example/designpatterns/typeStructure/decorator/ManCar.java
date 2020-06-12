package com.example.designpatterns.typeStructure.decorator;

public class ManCar extends ManWrapper {

    public ManCar(Man man) {
        super(man);
    }

    @Override
    void desc() {
        super.desc();
        addCar();
    }

    private void addCar() {
        System.out.println("有车");
    }


}
