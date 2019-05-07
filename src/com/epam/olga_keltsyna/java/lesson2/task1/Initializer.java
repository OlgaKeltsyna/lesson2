package com.epam.olga_keltsyna.java.lesson2.task1;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.GreenSalad;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.RedPaper;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.Vegetable;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.Сucumber;

public class Initializer {

    private static Vegetable searchVegetable = new GreenSalad("Salad", 30, 48, 0.001,
            0.05);

    private Initializer() {
    }

    public static Vegetable getSearchStone() {
        return searchVegetable;
    }

    public static Vegetable[] initializedArray() {
        return new Vegetable[]{
                new GreenSalad("Brown salad", 60, 33, 0.99, 0.05),
                new RedPaper("Sweet paper", 180, 98, 13.71, 0.25),
                new Сucumber("Green cucumber", 120, 28.65, 0.915, 90)};
    }
}
