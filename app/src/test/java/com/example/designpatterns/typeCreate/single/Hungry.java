package com.example.designpatterns.typeCreate.single;

/**
 * 饿汉式
 *
 */
public class Hungry {
    private static Hungry instance = new Hungry();
    public static  Hungry get(){
        return instance;
    }

    private Hungry(){}
}
