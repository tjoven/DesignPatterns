package com.example.designpatterns.status;

public class Client {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setCurrentStatus(new ClosedStoppedState(bus));

        bus.run();
        bus.stop();
        bus.openDoor();
        bus.closeDoor();
        bus.run();
    }
}
