package com.example.designpatterns.decorator;

public class NormalMan extends Man {
    String name;
    public NormalMan(String name){
        this.name = name;
    }
    @Override
    void desc() {
        System.out.println("我是 "+name);
    }
}
