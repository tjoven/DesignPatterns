package com.example.designpatterns.mediator;

public class ConcreteMediator extends SmartMediator{

    SmartDevice bath;
    SmartDevice music;
    public ConcreteMediator(SmartDevice bath,SmartDevice music){
        this.bath = bath;
        this.music = music;
    }

    @Override
    public void music() {
        music.doSomething();
    }

    @Override
    public void bath() {
        bath.doSomething();
    }
}
