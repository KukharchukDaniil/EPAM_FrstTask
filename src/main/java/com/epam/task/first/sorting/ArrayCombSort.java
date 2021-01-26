package com.epam.task.first.sorting;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayCombSort {
    private void comb(List<Integer> elements) {
        double factor = 1.2473309;
        int step = elements.size() - 1;

        while (step >= 1)
        {
            for (int i = 0; i + step < elements.size(); i++)
            {
                if (elements.get(i) > elements.get(i + step))
                {
                    int tmp = elements.get(i);
                    elements.set(i,elements.get(i+step));
                    elements.set(i+step,tmp);
                }
            }
            step /= factor;
        }
    }
    public Array sort(final Array array)
    {
        List<Integer> buffer = array.getElements();
        List<Integer> elements = new ArrayList<>(buffer);
        comb(elements);
        return new Array(elements);
    }
}
