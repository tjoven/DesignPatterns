package com.example.designpatterns.typeStructure.composite;

public class FileVideo implements File {
    @Override
    public void operate() {
        System.out.println("Video");
    }
}
