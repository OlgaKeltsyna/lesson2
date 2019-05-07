package com.epam.olga_keltsyna.java.lesson2.task1.Products;

public class RedPaper extends Vegetable {

    public RedPaper(String vegetableName, double price,
                      double calorie, double sugar, double bulkiness) {
        super(vegetableName, price, calorie, sugar);
    }
    @Override
    public double calculateVolume() {
        return this.getCalorie() * this.getSugar() / 100;
    }

}
