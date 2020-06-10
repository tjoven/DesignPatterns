package com.example.designpatterns.commmand;

public class LightOffCommand implements Command {

    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
