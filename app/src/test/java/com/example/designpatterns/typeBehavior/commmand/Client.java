package com.example.designpatterns.typeBehavior.commmand;

public class Client {

    public static void main(String[] args) {
        RemoteInvoker invoker  = new RemoteInvoker();
        Light light = new Light();
        invoker.setCommand(new LightOnCommand(light));
        invoker.turnOn();

        invoker.setCommand(new LightOffCommand(light));
        invoker.turnOn();
    }
}
