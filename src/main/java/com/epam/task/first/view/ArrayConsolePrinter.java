package com.epam.task.first.view;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayConsolePrinter implements ArrayPrinter {

    public void view(Array array) {
        List<Double> elements = array.getElements();
        for (Double element : elements) {
            System.out.println(element);
        }
    }
}
