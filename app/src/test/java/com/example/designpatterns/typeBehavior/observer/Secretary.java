package com.example.designpatterns.typeBehavior.observer;

import java.util.ArrayList;

public class Secretary {
    ArrayList<Staff> list = new ArrayList();

    public void attach(Staff staff){
        list.add(staff);
    }

    public void detach(Staff staff){
        list.remove(staff);
    }

    public void sendBroad(String message){
        System.out.println(message);
    }

    public void notifyChange(){
        for (Staff staff:
             list) {
            staff.updata();
        }
    }
}
