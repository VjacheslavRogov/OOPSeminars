package ru.geekbrains.oop.oop2.cw.z2;

public class Motocycle implements Transport{

    @Override
    public void start() {
        System.out.println("мотоцикл едет");
    }

    @Override
    public void stop() {
        System.out.println("мотоцикл остановился");
    }
}
