package com.spring.wednes.solid;

public class SingleResponsibilityPrinciple {

}

class Unit { // 지켜지지 않은 경우
    public String name;
    public int speed;

    public void attack() { }

    public void move() { // if 문으로 다른 경우를 나누어 놓았다. 좋지 않다.
        if (name.equals("저글링")) {
            speed += 3;
        } else if (name.equals("탱크")) {
            speed = 10;
        } else if (name.equals("정찰기")) {
            speed = 15;
        }
    }
}


// 단일 책임 원칙을 지킨거라고 하는데.
// 아직은 완벽히 이해되지 않는다.

class J extends Unit {

    @Override
    public void move() {
        this.speed += 3;
    }
}

class T extends  Unit {
    @Override
    public void move() {
        this.speed = 10;
    }
}

class S extends Unit {
    @Override
    public void move() {
        this.speed = 15;
    }
}