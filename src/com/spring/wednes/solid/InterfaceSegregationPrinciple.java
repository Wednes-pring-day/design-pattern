package com.spring.wednes.solid;

public class InterfaceSegregationPrinciple {
}

// 안좋은 예시
class Map {
    public void walk() {
    }

    public void car() {
    }

    public void bike() {
    }

    public void sky() {
    }

    public void ocean() {
    }

    public void subway() {
    }

}

class CarMap extends Map {
    @Override
    public void walk() {

    }

    @Override
    public void car() {
        super.car();
    }

    @Override
    public void bike() {

    }

    @Override
    public void sky() {

    }

    @Override
    public void ocean() {

    }

    @Override
    public void subway() {

    }
}