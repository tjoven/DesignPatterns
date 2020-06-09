package com.example.designpatterns.create.single;

/**
 * 懒汉式
 */
public class Lazy {

    static Lazy instance = null;
    public static synchronized Lazy get(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }

    private Lazy(){

    }
}
