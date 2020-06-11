package com.example.designpatterns.mediator;

public class MusicDevice extends SmartDevice {
    @Override
    public void ready() {
        System.out.println("播放音乐");
        mediator.bath();

    }

    @Override
    public void doSomething() {
        System.out.println("播放音乐 准备");
    }
}
