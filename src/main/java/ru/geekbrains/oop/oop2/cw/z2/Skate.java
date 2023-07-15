package ru.geekbrains.oop.oop2.cw.z2;

public class Skate implements Transport {

    @Override
    public void start() {
        System.out.println("скейт едет");
    }

    public void stop() {
        System.out.println("скейт остановился");
    }
}
