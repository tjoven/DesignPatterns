package com.example.designpatterns.typeBehavior.memo;

public class RoleStateMemento {

    public RoleStateMemento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    private int vitality;//生命力

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    private int attack;//攻击力
    private int defense;// 防御力
}
