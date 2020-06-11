package com.example.designpatterns.proxy.proxyStatic;


public class Client {

    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject();
        proxy.buyMac();
    }
}
