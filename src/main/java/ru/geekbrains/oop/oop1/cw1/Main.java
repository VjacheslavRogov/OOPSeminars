package ru.geekbrains.oop.oop1.cw1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 21;
        cat1.name = "Barsik";
        cat1.color = "orange";
        System.out.println("Кот : " + cat1.name + " с цветом шерсти: " + cat1.color + " возрастом : " + cat1.age);
    }
}
