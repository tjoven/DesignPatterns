package com.example.designpatterns.typeStructure.decorator;

public abstract class ManWrapper extends Man{

    Man man;
    public ManWrapper(Man man){
        this.man = man;
    }

    @Override
    void desc() {
        man.desc();
    }
}
