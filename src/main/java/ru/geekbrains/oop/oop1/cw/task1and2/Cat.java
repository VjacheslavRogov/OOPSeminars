package ru.geekbrains.oop.oop1.cw.task1and2;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (age > 0 && age < 30) {
            this.age = age;
        } else {
            System.out.println("Возраст введён некорректно!");
        }
    }

    @Override
    public String toString(){
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo(){
        System.out.println("Это кот с именем " + name
                +", с возрастом-"+ age + " , с цветом шерсти: " + color);
    }

    @Override
    public void voice() { System.out.println("мявк! мявк!"); }

    @Override
    public void jump() { System.out.println("прыжек кота!"); }
}