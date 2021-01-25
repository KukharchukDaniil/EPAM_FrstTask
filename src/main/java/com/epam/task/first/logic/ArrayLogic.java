package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayLogic{

    public Integer findMax(Array array)  {
        
        List<Integer> elements = array.getElements();
        Integer max = elements.get(0);
        for (Integer element : elements) {
            if(max < element){
                max = element;
            }
        }
        return max;
    }

    public Integer findMin(Array array)  {
        
        List<Integer> elements = array.getElements();
        Integer min = elements.get(0);
        for (Integer element : elements) {
            if(min > element){
                min = element;
            }
        }
        return min;
    }

    public Double getAverage(Array array)  {
        
        List<Integer> elements = array.getElements();
        Double sum = Double.valueOf(getSum(array));
        return sum/elements.size();
    }

    public Integer getSum(Array array)  {

        Integer sum = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            sum+=element;
        }
        return sum;
    }

    public Integer countPositive(Array array)  {
        
        Integer counter = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            if(element > 0){
                counter++;
            }
        }
        return counter;
    }

    public Integer countNegative(Array array)  {
        
        Integer counter = 0;
        List<Integer> elements = array.getElements();
        for (Integer element : elements) {
            if(element < 0){
                counter++;
            }
        }
        return counter;
    }


    public Array replaceIf(Array array, Predicate<Integer> predicate, Integer replaceValue)  {
        
        List<Integer> elements = array.getElements();
        List<Integer> result = new ArrayList<>();
        for (Integer element : elements) {
            if (predicate.test(element)) {
                result.add(replaceValue);
            } else {
                result.add(element);
            }
        }
        return new Array(result);
    }
//
}
