package com.example.designpatterns.typeStructure.proxy.proxyStatic;


public class Client {

    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject();
        proxy.buyMac();
    }
}
