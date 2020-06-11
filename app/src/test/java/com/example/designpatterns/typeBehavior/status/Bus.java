package com.example.designpatterns.typeBehavior.status;

public class Bus implements Behavior{

    private BusStatus currentStatus = new ClosedStoppedState(this);
    /**分别代表四种状态*/
    public static BusStatus OPENED_STOPPED_STATE;
    public static BusStatus OPENED_RUNNING_STATE;
    public static BusStatus CLOSED_STOPPED_STATE;
    public static BusStatus CLOSED_RUNNING_STATE;

    public Bus(){
        OPENED_STOPPED_STATE = new OpenedStopedStatus(this);
        OPENED_RUNNING_STATE = new OpenedRunningState(this);
        CLOSED_STOPPED_STATE = new ClosedStoppedState(this);
        CLOSED_RUNNING_STATE = new ClosedRunningState(this);
    }

    public void setCurrentStatus(BusStatus status){
        this.currentStatus = status;
    }

    @Override
    public void openDoor() {
        currentStatus.openDoor();
    }

    @Override
    public void closeDoor() {
        currentStatus.closeDoor();
    }

    @Override
    public void run() {
        currentStatus.run();
    }

    @Override
    public void stop() {
        currentStatus.stop();
    }
}
