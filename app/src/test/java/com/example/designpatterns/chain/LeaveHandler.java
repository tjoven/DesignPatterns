package com.example.designpatterns.chain;

public abstract class LeaveHandler {

    public int MIN  = 1;
    public int MIDDLE = 10;
    public int MAX = 20;

    public int CODE_AGREE = 1;
    public int CODE_DISAGREE = -1;
    public LeaveHandler nextHandler;

    public abstract int handler(LeaveRequest request);

    public void setHandler(LeaveHandler handler){
        this.nextHandler = handler;
    }
}
