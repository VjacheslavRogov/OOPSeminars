package ru.geekbrains.oop.oop2.cw.z2;

public class Bycicle implements Transport{

    @Override
    public void start() {
        System.out.println("велосипед едет");
    }

    public void stop(){
        System.out.println("велосипед остановился");
    }
}
