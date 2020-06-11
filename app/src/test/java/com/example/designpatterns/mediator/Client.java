package com.example.designpatterns.mediator;

public class Client {
    public static void main(String[] args) {
        BathDevice bathDevice = new BathDevice();
        MusicDevice musicDevice = new MusicDevice();

        ConcreteMediator mediator = new ConcreteMediator(bathDevice,musicDevice);

        bathDevice.regisMediator(mediator);
        musicDevice.regisMediator(mediator);
        bathDevice.ready();
        musicDevice.ready();
    }
}
