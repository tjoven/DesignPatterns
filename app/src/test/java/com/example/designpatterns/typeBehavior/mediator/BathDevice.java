package com.example.designpatterns.typeBehavior.mediator;

public class BathDevice extends SmartDevice {
    @Override
    public void ready() {
        System.out.println("开始洗澡");
        mediator.music();
    }

    @Override
    public void doSomething() {
        System.out.println("开始洗澡 准备");
    }


}
