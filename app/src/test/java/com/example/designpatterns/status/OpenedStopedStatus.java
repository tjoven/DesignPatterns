package com.example.designpatterns.status;

public class OpenedStopedStatus extends BusStatus{
    public OpenedStopedStatus(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        System.out.println("！！已经开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
        bus.setCurrentStatus(Bus.CLOSED_STOPPED_STATE);
    }

    @Override
    public void run() {
        System.out.println("开车");
        bus.setCurrentStatus(Bus.OPENED_RUNNING_STATE);
    }

    @Override
    public void stop() {
        System.out.println("！！已经关门");
    }
}
