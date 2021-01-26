package com.epam.task.first.entities;

import java.util.Arrays;
import java.util.List;

public class Array {
    Double[] elements;
    public Array(Double... elements){
        this.elements = elements;
    }
    public Array(){
        this.elements = new Double[0]; //Сомневаюсь, что так делать корректно
    }

    public Double[] getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }
}
