package com.example.designpatterns.composite;

import java.util.ArrayList;

public class Folder implements File {
    ArrayList<File> list = new ArrayList<>();
    String name ;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("Folder: " + name);
        for (File file:
             list) {
            file.operate();
        }
    }

    public void addFile(File file){
        list.add(file);
    }

    public void remove(File file){
        list.remove(file);
    }
}
