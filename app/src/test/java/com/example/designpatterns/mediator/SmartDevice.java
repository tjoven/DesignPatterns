package com.example.designpatterns.mediator;

public abstract class SmartDevice {

    SmartMediator mediator;

    public abstract void ready();

    public abstract void doSomething();

    public void regisMediator(SmartMediator mediator){
        this.mediator = mediator;
    }
}
