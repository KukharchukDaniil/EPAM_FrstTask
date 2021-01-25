package com.epam.task.first.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Array {
    private final List<Double> elements;
    public Array(Double... elements){
        this.elements = Arrays.asList(elements);
    }

    public Array(List<Double> elements) {
        this.elements = elements;
    }

    public List<Double> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Array array = (Array) o;
        return elements.equals(array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
