package ru.geekbrains.oop.oop1.cw.z1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();
    }
}
