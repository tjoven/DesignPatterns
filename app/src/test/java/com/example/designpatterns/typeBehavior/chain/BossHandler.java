package com.example.designpatterns.typeBehavior.chain;

class BossLeader extends LeaveHandler {
    @Override
    public int handler(LeaveRequest request) {
        if(request.days < MAX){
            System.out.println("BOSS 同意");
            return CODE_AGREE;
        }
        return CODE_DISAGREE;


    }
}
