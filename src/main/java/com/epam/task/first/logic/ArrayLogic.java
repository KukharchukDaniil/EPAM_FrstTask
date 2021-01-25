package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayLogic{

    public Double findMax(Array array)  {
        
        List<Double> elements = array.getElements();
        Double max = elements.get(0);
        for (Double element : elements) {
            if(max < element){
                max = element;
            }
        }
        return max;
    }

    public Double findMin(Array array)  {
        
        List<Double> elements = array.getElements();
        Double min = elements.get(0);
        for (Double element : elements) {
            if(min > element){
                min = element;
            }
        }
        return min;
    }

    public Double getAverage(Array array)  {
        
        List<Double> elements = array.getElements();
        Double sum = getSum(array);
        return sum/elements.size();
    }

    public Double getSum(Array array)  {
        
        Double sum = 0.0;
        List<Double> elements = array.getElements();
        for (Double element : elements) {
            sum+=element;
        }
        return sum;
    }

    public Integer countPositive(Array array)  {
        
        Integer counter = 0;
        List<Double> elements = array.getElements();
        for (Double element : elements) {
            if(element > 0){
                counter++;
            }
        }
        return counter;
    }

    public Integer countNegative(Array array)  {
        
        Integer counter = 0;
        List<Double> elements = array.getElements();
        for (Double element : elements) {
            if(element < 0){
                counter++;
            }
        }
        return counter;
    }


    public Array replaceIf(Array array, Predicate<Double> predicate, Double replaceValue)  {
        
        List<Double> elements = array.getElements();
        List<Double> result = new ArrayList<>();
        for (Double element : elements) {
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
