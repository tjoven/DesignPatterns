package com.example.designpatterns.composite;

public class FileText implements File {
    @Override
    public void operate() {
        System.out.println("Text");
    }
}
