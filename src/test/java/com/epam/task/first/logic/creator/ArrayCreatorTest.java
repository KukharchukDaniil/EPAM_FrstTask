package com.epam.task.first.logic.creator;

import com.epam.task.first.creator.*;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> VALID_TEST_DATA = Arrays.asList("-1 2 3", "eg 4 6");
    private final static List<String> INVALID_TEST_DATA = Arrays.asList("1 2b 3", "eg 4 6");
    private  DataReader reader;
    private  ArrayParser parser = new ArrayParser();
    private  ArrayValidator validator = new ArrayValidator();
    @BeforeEach
    private void before()
    {
        reader = Mockito.mock(DataReader.class);
    }


    @Test
    public void testCreateShouldCreateArraysWhenDataIsValid() throws DataException {
        //given
        before();
        ArrayCreator creator = new ArrayCreator(parser, validator,reader);
        List<Array> expected = Arrays.asList(new Array(-1,2,3));
        //when
        when (reader.readData(anyString())).thenReturn(VALID_TEST_DATA);
        List<Array> actual = creator.create("abc");
        //than
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testCreateShouldCreateArraysWhenDataIsInvalid() throws DataException {
        //given
        before();
        ArrayCreator creator = new ArrayCreator(parser, validator,reader);
        List<Array> expected = Collections.emptyList();
        //when
        when (reader.readData(anyString())).thenReturn(INVALID_TEST_DATA);
        List<Array> actual = creator.create("abc");
        //than
        Assert.assertEquals(expected,actual);

    }
}
