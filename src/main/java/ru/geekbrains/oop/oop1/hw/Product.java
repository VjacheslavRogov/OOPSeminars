package ru.geekbrains.oop.oop1.hw;

public class Product {
    private String name;
    private Double price;
    private Integer rating;

    public Product(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getRating() {
        return rating;
    }
}
