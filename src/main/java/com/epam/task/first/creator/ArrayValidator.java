package com.epam.task.first.creator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    public boolean validate(String data)
    {
        Pattern pattern = Pattern.compile("[^\\s\\d-]+");
        Matcher matcher = pattern.matcher(data);
        boolean containsNonInteger = false;
        containsNonInteger = matcher.find();

        pattern = Pattern.compile("(\\+|-)?\\d+");
        boolean containsInteger;
        matcher = pattern.matcher(data);
        containsInteger = matcher.find();
        return !containsNonInteger && containsInteger && !data.isEmpty();
    }

}
