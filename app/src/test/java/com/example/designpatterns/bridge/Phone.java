package com.example.designpatterns.bridge;

public abstract class Phone {

    public Memory memory;

    public Phone(Memory memory){
        this.memory = memory;
    }

    public abstract void buy();
}
