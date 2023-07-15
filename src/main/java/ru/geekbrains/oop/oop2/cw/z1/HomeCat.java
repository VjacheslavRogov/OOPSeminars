package ru.geekbrains.oop.oop2.cw.z1;

public class HomeCat extends Cat {

    protected static int count;

    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}
