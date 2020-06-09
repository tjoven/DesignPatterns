package com.example.designpatterns.create.single;

/**
 * 静态内部类
 * 类第一次使用才加载
 */
public class InnerClass {


    private static class SingleHolder{
        static InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance(){
        return SingleHolder.instance;
    }

    private InnerClass(){

    }
}
