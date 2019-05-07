package com.epam.olga_keltsyna.java.lesson2.task1.SideDishes;
import com.epam.olga_keltsyna.java.lesson2.task1.Products.Vegetable;
import java.util.Comparator;

public class DescendingOrderer implements Comparator<Vegetable> {

    public int compare(Vegetable arg0, Vegetable arg1) {
        return (int) -(arg0.getCalorie() - arg1.getCalorie());
    }

}