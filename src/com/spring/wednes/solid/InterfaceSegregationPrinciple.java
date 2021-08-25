package com.spring.wednes.solid;

public class InterfaceSegregationPrinciple {
}

interface ICarMap {
    public void car();
}

interface IBikeMap {
    public void bike();
}


class CarMap implements ICarMap { // 자동차 내비는 자동차 길안내만 있으면 된다.

    @Override
    public void car() {
        // 자동차~
    }
}

class Map implements ICarMap, IBikeMap { // 지도는 모든 종류의 안내가 가능해야한다.

    @Override
    public void car() { // 자동차 길 안내!
    }

    @Override
    public void bike() {  // 바이크 길 안내!
    }
}