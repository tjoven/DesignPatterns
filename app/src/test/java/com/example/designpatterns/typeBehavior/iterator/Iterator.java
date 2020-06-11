package com.example.designpatterns.typeBehavior.iterator;

public interface Iterator<T> {

    T first();
    T last();
    boolean hasNext();
    T next();

}
