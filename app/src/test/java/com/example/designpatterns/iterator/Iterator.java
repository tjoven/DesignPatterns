package com.example.designpatterns.iterator;

import java.util.ArrayList;

public interface Iterator<T> {

    T first();
    T last();
    boolean hasNext();
    T next();

}
