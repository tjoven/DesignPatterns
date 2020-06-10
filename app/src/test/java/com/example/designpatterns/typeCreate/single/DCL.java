package com.example.designpatterns.typeCreate.single;

public class DCL {
    private static  volatile DCL instance = null;
    private byte[] lock = new byte[10];

    public DCL getInstance(){
        if (instance == null){
            synchronized (lock){
                if (instance == null){
                    instance = new DCL();
                }

            }
        }

        return instance;
    }

    private DCL(){}

}
