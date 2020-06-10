package com.example.designpatterns.memo;

public class GameRole {
    private int vitality;//生命力
    private int attack;//攻击力
    private int defense;// 防御力

    public RoleStateMemento saveMemento(){
        return new RoleStateMemento(vitality,attack,defense);
    }

    public void restoreMemento(RoleStateMemento memento){
        this.vitality = memento.getVitality();
        this.attack  = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void initState(){
        vitality =100;
        attack = 100;
        defense = 100;
    }

    public void meetBoss(){
        System.out.println("遇到 Boss");
        vitality = 0;
        attack = 0;
        defense = 0;
    }

    public void show(){
        System.out.println("vitality : "+vitality);
        System.out.println("attack : "+attack);
        System.out.println("defense : "+defense);

        System.out.println(" ----------------------- ");
    }
}
