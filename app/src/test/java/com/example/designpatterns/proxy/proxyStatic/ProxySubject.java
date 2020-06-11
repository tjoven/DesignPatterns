package com.example.designpatterns.proxy.proxyStatic;

public class ProxySubject implements Subject{

    Subject real;
    public ProxySubject(){
        this.real = new RealSubject();

    }
    @Override
    public void buyMac() {
        pre();
        real.buyMac();
        after();
    }

    private void after() {
        System.out.println("坐车回来");
    }

    private void pre() {
        System.out.println("坐车出发");
    }
}
