package com.epam.task.first.view;

import com.epam.task.first.entities.Array;

public class ArrayConsolePrinter implements ArrayPrinter {

    public void view(Array array) {
        Double[] elements = array.getElements();
        for (Double element : elements) {
            System.out.println(element);
        }
    }
}
