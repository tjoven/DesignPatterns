package com.example.designpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        Memory memory6 = new Memory6G();
        Memory memory8 = new Memory8G();
        Phone huaWeiPhone = new HuaWeiPhone(memory6);
        Phone mi = new XiaoMiPhone(memory8);

        huaWeiPhone.buy();
        mi.buy();
    }
}
