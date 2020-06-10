package com.example.designpatterns.iterator;

public interface Collection<T> {
    void add(T t);
    void remove(T t);
    Iterator<T> iterator();
}
