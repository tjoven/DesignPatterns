package com.example.designpatterns.typeBehavior.memo;

public class RoleStateCaretaker {
    RoleStateMemento memento;

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

    public RoleStateMemento getMemento() {
        return memento;
    }
}
