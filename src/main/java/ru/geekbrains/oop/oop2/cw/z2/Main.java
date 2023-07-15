package ru.geekbrains.oop.oop2.cw.z2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bycicle bycicle = new Bycicle();
        human.stop();
        human.drive(bycicle);
        human.stop();
        Motocycle motocycle = new Motocycle();
        human.stop();
        human.drive(motocycle);
        human.stop();
    }
}
