package com.example.designpatterns.typeBehavior.status;

/**
 * 关门运行状态
 */
public class ClosedRunningState extends BusStatus {

    public ClosedRunningState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        new UnsupportedOperationException("运行时，不允许开车门");
    }

    @Override
    public void closeDoor() {
        System.out.println("！！车门已经关闭");
    }

    @Override
    public void run() {
        System.out.println("！！已经运行");
    }

    @Override
    public void stop() {
        System.out.println("停车");
        bus.setCurrentStatus(Bus.CLOSED_STOPPED_STATE);
    }
}
