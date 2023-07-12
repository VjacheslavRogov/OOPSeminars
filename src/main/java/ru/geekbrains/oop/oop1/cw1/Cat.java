package ru.geekbrains.oop.oop1.cw1;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введён некорректно!");
        }
    }

    public Cat(String color, Integer age) {
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Кот : " + super.getName() + " с цветом шерсти: " + getColor() + " прожил : " + getAge() + " лет");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введён некорректно!");
        }

    }
}