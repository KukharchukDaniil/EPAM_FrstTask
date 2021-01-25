package com.epam.task.first.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Array {
    private final List<Integer> elements;
    public Array(Integer... elements){
        this.elements = Arrays.asList(elements);
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements() {
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
