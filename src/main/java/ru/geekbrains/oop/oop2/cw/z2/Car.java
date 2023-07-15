package ru.geekbrains.oop.oop2.cw.z2;

public class Car implements Transport{

    @Override
    public void start() {
        System.out.println("машина едет");
    }

    public void stop(){
        System.out.println("машина остановилась");
    }
}
