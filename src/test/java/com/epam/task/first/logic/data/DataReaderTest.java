package com.epam.task.first.logic.data;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReaderTest {
    private static final String INPUT_VALID = "src\\test\\resources\\input1";
    private static final String INPUT_INVALID = "src\\test\\resources\\input3";

    @Test
    public void testDataReaderShouldReadDataWhenInputIsValid() throws DataException {
        //given
        DataReader dataReader = new DataReader();

        //when
        List<String> expected = Arrays.asList("1 2 3", "asd 2 3");
        List<String> actual = dataReader.readData(INPUT_VALID);
        //than
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDataReaderShouldReadDataWhenInputIsInvalid() {
        //given
        DataReader dataReader = new DataReader();


        //than
        try {
            List<String> actual = dataReader.readData(INPUT_INVALID);
            Assert.fail("Expected DataException");
        }catch (DataException e)
        {
            Assert.assertNotEquals("", e.getMessage());
        }


    }
}
