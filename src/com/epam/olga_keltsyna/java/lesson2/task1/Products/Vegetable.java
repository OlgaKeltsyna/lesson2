package com.epam.olga_keltsyna.java.lesson2.task1.Products;

public abstract class Vegetable implements RecommendedVolume {

    private String vegetableName;
    private double price;
    private double calorie;
    private double sugar;

    public Vegetable(String vegetableName, double price,
                     double calorie, double sugar) {
        this.vegetableName = vegetableName;
        this.price = price;
        this.calorie = calorie;
        this.sugar = sugar;
    }

    public abstract double calculateVolume();

    public double getPrice() {
        return price;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public double getCalorie() {
        return calorie;
    }

    public double getSugar() {
        return sugar;
    }

}