package com.example.designpatterns.proxy.proxyStatic;

public class RealSubject implements Subject{
    @Override
    public void buyMac() {
        System.out.println("买个电脑");
    }
}
