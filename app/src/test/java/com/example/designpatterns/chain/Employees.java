package com.example.designpatterns.chain;

public class Employees {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest();
        request.days = 14;

        DirectLeader directLeader = new DirectLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        BossLeader bossLeader = new BossLeader();

        directLeader.nextHandler = managerLeader;
        managerLeader.nextHandler = bossLeader;

        directLeader.handler(request);
    }
}
