package com.example.designpatterns.typeStructure.composite;

public class FileText implements File {
    @Override
    public void operate() {
        System.out.println("Text");
    }
}
