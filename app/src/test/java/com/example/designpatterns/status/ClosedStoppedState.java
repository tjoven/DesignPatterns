package com.example.designpatterns.status;

public class ClosedStoppedState extends BusStatus{
    public ClosedStoppedState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        System.out.println("开门");
        bus.setCurrentStatus(Bus.OPENED_STOPPED_STATE);
    }

    @Override
    public void closeDoor() {
        System.out.println("！！车门已经关闭");
    }

    @Override
    public void run() {
        System.out.println("开车");
        bus.setCurrentStatus(Bus.CLOSED_RUNNING_STATE);
    }

    @Override
    public void stop() {
        System.out.println("！！已停止运行");
    }
}
