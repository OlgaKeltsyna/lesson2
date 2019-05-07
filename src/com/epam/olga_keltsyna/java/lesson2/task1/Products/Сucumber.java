package com.epam.olga_keltsyna.java.lesson2.task1.Products;

public class Сucumber extends Vegetable {

    private double waterProportion;

    public Сucumber(String vegetableName, double price,
                      double calorie, double sugar, double waterProportion) {
        super(vegetableName, price, calorie, sugar);
        this.waterProportion = waterProportion;
    }
    @Override
    public double calculateVolume() {
        return this.getCalorie() * this.getSugar()
                * this.getWaterProportion();
    }

    public double getWaterProportion() {
        return waterProportion;
    }
}
