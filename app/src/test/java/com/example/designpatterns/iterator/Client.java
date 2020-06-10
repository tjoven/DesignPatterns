package com.example.designpatterns.iterator;

public class Client {
    public static void main(String[] args) {
        String[] names = {"aa","bb","cc","dd"};
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        for (String name:
             names) {
            collection.add(name);
        }

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
