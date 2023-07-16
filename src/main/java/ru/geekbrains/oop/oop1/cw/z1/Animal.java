package ru.geekbrains.oop.oop1.cw.z1;

public class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное по имени: " + name);
    }

    public void voice() {
        System.out.println("Звук");
    }

    public void jump() {
        System.out.println("Прыхок");
    }
}
