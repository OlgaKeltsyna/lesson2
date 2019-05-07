package com.epam.olga_keltsyna.java.lesson2.task1.Products;

public class GreenSalad extends Vegetable {

    private double bulkiness;

    public GreenSalad(String vegetableName, double price,
                      double calorie, double sugar, double bulkiness) {
        super(vegetableName, price, calorie, sugar);
        this.bulkiness = bulkiness;
    }
    @Override
    public double calculateVolume() {
        return this.getCalorie() * this.getSugar()
                / this.getBulkiness();
    }

    public double getBulkiness() {
        return bulkiness;
    }
}
