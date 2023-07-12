package ru.geekbrains.oop.oop1.cw1.task1and2;

import ru.geekbrains.oop.oop1.cw1.task1and2.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "orange", 21);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
    }
}
