package com.example.designpatterns.typeBehavior.observer;

public class Client {
    public static void main(String[] args) {
        StaffA staffA = new StaffA();
        StaffB staffB = new StaffB();

        Secretary secretary = new Secretary();
        secretary.attach(staffA);
        secretary.attach(staffB);
        secretary.sendBroad("Boss 来了");
        secretary.notifyChange();
    }
}
