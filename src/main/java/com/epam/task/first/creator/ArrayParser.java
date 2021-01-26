package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayParser {
    public Array parse(String data)
    {
        StringTokenizer stringTokenizer = new StringTokenizer(data);
        List<Integer> elements = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens())
        {
            String token = stringTokenizer.nextToken(" ");
            Integer element = Integer.valueOf(token);
            elements.add(element);
        }
        return new Array(elements);
    }
}
