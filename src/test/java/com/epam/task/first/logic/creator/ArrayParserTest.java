package com.epam.task.first.logic.creator;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayParserTest {
    private final static String TEST_DATA = "23 4 1 4 -2 5";

    @Test
    public void testParseShouldParseArray()
    {
        //given
        ArrayParser parser = new ArrayParser();
        Array expected = new Array(23, 4, 1, 4, -2, 5);

        //when
        Array actual = parser.parse(TEST_DATA);

        //than
        Assert.assertEquals(expected,actual);
    }
}
