package com.example.designpatterns.typeStructure.decorator;

public class ManHouse extends ManWrapper {
    public ManHouse(Man man) {
        super(man);
    }

    @Override
    void desc() {
        super.desc();
        addHouse();
    }

    private void addHouse() {
        System.out.println("有房");
    }
}
