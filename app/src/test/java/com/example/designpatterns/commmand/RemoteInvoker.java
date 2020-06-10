package com.example.designpatterns.commmand;

public class RemoteInvoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void turnOn(){
        if(command instanceof LightOnCommand){
            command.execute();
        }else {
            System.out.println("不能执行此命令");
        }
    }

    public void turnOff(){
        if(command instanceof LightOffCommand){
            command.execute();
        }else {
            System.out.println("不能执行此命令");
        }
    }
}
