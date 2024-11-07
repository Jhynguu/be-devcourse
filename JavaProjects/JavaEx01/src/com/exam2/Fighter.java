package com.exam2;

public class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {
        System.out.println("이동");
    }

    public void attack(Unit unit) {
        System.out.println("공격");
    }
}
