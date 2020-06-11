package com.example.designpatterns.typeBehavior.iterator;

import java.util.ArrayList;

public class ConcreteCollection<T> implements Collection<T> {

    ArrayList<T> list = new ArrayList<>();
    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr<T>();
    }

    class Itr<E> implements Iterator<T>{

        int index  = 0;
        @Override
        public T first() {
            return list.get(0);
        }

        @Override
        public T last() {
            if(list.size() <= 0){
                return  null;
            }
            return list.get(list.size()-1);
        }

        @Override
        public boolean hasNext() {
            return index < (list.size() );
        }

        @Override
        public T next() {
            if(hasNext()){
                return list.get(index++);
            }
            return null;
        }
    }
}
