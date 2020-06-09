package com.example.designpatterns.chain;

public class ManagerLeader extends LeaveHandler {
    @Override
    public int handler(LeaveRequest request) {
        if(request.days < MIDDLE){
            System.out.println("经理同意");
            return CODE_AGREE;
        }

        System.out.println("请示BOSS");
        if(nextHandler != null){
           return nextHandler.handler(request);
        }else {
            return CODE_DISAGREE;
        }

    }
}
