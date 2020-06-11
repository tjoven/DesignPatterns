package com.example.designpatterns.typeBehavior.chain;

public class DirectLeader extends LeaveHandler {
    @Override
    public int handler(LeaveRequest request) {
        if(request.days < MIN){
            System.out.println("DirectLeader 同意");
            return CODE_AGREE;
        }
        System.out.println("请示经理");
        if(nextHandler != null){
            return nextHandler.handler(request);
        }else {
            System.out.println("不同意");
            return CODE_DISAGREE;
        }

    }
}
