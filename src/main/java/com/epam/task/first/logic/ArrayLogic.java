package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.view.ArrayConsolePrinter;
import junit.framework.Assert;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayLogic{
    public boolean checkArray(Array array){
        Double[] elements = array.getElements();
        return elements.length>0;
    }

    public Double findMax(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double[] elements = array.getElements();
        Double max = elements[0];
        for (Double element : elements) {
            if(max < element){
                max = element;
            }
        }
        return max;
    }

    public Double findMin(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double[] elements = array.getElements();
        Double min = elements[0];
        for (Double element : elements) {
            if(min > element){
                min = element;
            }
        }
        return min;
    }

    public Double findMean(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double[] elements = array.getElements();
        Double sum = getSum(array);
        return sum/elements.length;
    }

    public Double getSum(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double sum = 0.0;
        Double[] elements = array.getElements();
        for (Double element : elements) {
            sum+=element;
        }
        return sum;
    }

    public Integer countPositive(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Integer counter = 0;
        Double[] elements = array.getElements();
        for (Double element : elements) {
            if(element > 0){
                counter++;
            }
        }
        return counter;
    }

    public Integer countNegative(Array array) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Integer counter = 0;
        Double[] elements = array.getElements();
        for (Double element : elements) {
            if(element < 0){
                counter++;
            }
        }
        return counter;
    }

    public void replaceIfGreater(Array array, Double conditionValue, Double replaceValue) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double[] elements = array.getElements();
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] > conditionValue){
                elements[i] = replaceValue;
            }
        }
    }

    public void replaceIf(Array array, Predicate<Double> predicate, Double replaceValue) {
        if(!checkArray(array)){
            throw new IllegalArgumentException("Array is empty!");
        }
        Double[] elements = array.getElements();
        for (int i = 0; i < elements.length; i++) {
            if(predicate.test(elements[i])){
                elements[i] = replaceValue;
            }
        }
    }
//
}
