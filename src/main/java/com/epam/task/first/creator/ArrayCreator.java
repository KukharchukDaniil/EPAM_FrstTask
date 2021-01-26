package com.epam.task.first.creator;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    private final ArrayParser parser;
    private final ArrayValidator validator;
    private final DataReader dataReader;

    public ArrayCreator(ArrayParser parser, ArrayValidator validator, DataReader dataReader) {
        this.parser = parser;
        this.validator = validator;
        this.dataReader = dataReader;
    }
    public List<Array> create(String filename) throws DataException {
        List<Array> arrays = new ArrayList<>();
        List<String> data = dataReader.readData(filename);
        for (String datum : data) {
            if(validator.validate(datum))
            {
                Array array = parser.parse(datum);
                arrays.add(array);
            }
        }

        return arrays;
    }
}
