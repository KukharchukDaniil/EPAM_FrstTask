package com.epam.task.first.sorting;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayQuickSort {

    private void partition(List<Integer> elements,int left, int right)
    {
        if (elements.size() == 0 || elements.size() == 1)
            return;

        if (left >= right)
            return;
        int middle = (left+right)/2;
        int midElement = elements.get(middle);
        int i = left, j = right;
        while (i <= j) {
            while (midElement > elements.get(i) && i<right) {
                i++;
            }

            while (midElement < elements.get(j)&& j > left)  {
                j--;
            }

            if (i <= j) {
                int tmp = elements.get(i);
                elements.set(i,elements.get(j));
                elements.set(j,tmp);
                i++;
                j--;
            }
        }

        if (left < j) {
            partition(elements, left, j);
        }

        if (right > i) {
            partition(elements, i, right);
        };

    }
    public Array sort(final Array array)
    {
        List<Integer> buffer = array.getElements();
        List<Integer> elements = new ArrayList<>(buffer);
        partition(elements,0,elements.size()-1);
        return new Array(elements);
    }

}
