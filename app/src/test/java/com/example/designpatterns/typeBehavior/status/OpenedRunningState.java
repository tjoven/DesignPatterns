package com.example.designpatterns.typeBehavior.status;

public class OpenedRunningState extends BusStatus{
    public OpenedRunningState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        System.out.println("！！已经开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
        bus.setCurrentStatus(Bus.CLOSED_RUNNING_STATE);
    }

    @Override
    public void run() {
        System.out.println("！！已经运行");
    }

    @Override
    public void stop() {
        System.out.println("停车");
        bus.setCurrentStatus(Bus.OPENED_STOPPED_STATE);
    }
}
