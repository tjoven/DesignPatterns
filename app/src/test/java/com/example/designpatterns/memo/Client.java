package com.example.designpatterns.memo;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.show();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveMemento());

        gameRole.meetBoss();
        gameRole.show();

        gameRole.restoreMemento(caretaker.getMemento());
        gameRole.show();
    }
}
