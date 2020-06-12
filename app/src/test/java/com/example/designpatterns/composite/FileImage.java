package com.example.designpatterns.composite;

public class FileImage implements File {
    @Override
    public void operate() {
        System.out.println("Image");
    }
}
