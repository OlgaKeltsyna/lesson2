package com.epam.olga_keltsyna.java.lesson2.task1.SideDishes;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.Vegetable;
import java.util.Arrays;
import java.util.Comparator;

public class SaladCreater {
    private Vegetable[] arrayVegetables;
    private Comparator<Vegetable> comparator = new DescendingOrderer();

    public SaladCreater(Vegetable[] arrayVegetables) {
        this.arrayVegetables = arrayVegetables;
    }

    public Vegetable[] getArrayVegetables() {
        return arrayVegetables;
    }

    public double calculateCalorie() {
        double result = 0;
        for (int i = 0; i < arrayVegetables.length; i++) {
            result += arrayVegetables[i].getCalorie();
        }
        return result;
    }

    public void sortVegetables() {
        Arrays.sort(arrayVegetables, comparator);
    }

    public void findVegetable(double minCalorie, double maxCalorie) {
        sortVegetables();
        int isFind = 0;
        for (int i = 0; i < arrayVegetables.length; i++) {
            if (arrayVegetables[i].getCalorie() >= minCalorie
                    && arrayVegetables[i].getCalorie() <= maxCalorie) {
                System.out.println("Found a vegetable with calories "
                        + arrayVegetables[i].getCalorie() + "(" + arrayVegetables[i].getVegetableName() + ")");
                isFind = 1;
            }
        }
        if (isFind == 0)
            System.out.println("Nothing found :(");
    }

    public void printVegetables() {
        for (int i = 0; i < arrayVegetables.length; i++)
        System.out.println(arrayVegetables[i].getVegetableName()
                + "(" + arrayVegetables[i].getCalorie() + ")");
    }

}
