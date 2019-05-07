package com.epam.olga_keltsyna.java.lesson2.task1;

import com.epam.olga_keltsyna.java.lesson2.task1.SideDishes.SaladCreater;

public class Runner {

    static final int MIN_VALUE_CALORIE = 20;
    static final int MAX_VALUE_CALORIE = 30;

    public static void main(String[] args) {

        SaladCreater createdSalad = new SaladCreater(
                Initializer.initializedArray());

        System.out.println("Calorie cooked salad: " + createdSalad.calculateCalorie());

        System.out.println("Vegetables before sorting on calorie: ");
        createdSalad.printVegetables();
        System.out.println("Vegetables after sorting on calorie: ");
        createdSalad.sortVegetables();
        createdSalad.printVegetables();

        System.out.println("In the range from " + MIN_VALUE_CALORIE
                + " to " + MAX_VALUE_CALORIE + " calories found vegetables in a salad: ");
        createdSalad.findVegetable(MIN_VALUE_CALORIE,MAX_VALUE_CALORIE);
    }
}
