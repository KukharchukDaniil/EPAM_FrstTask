package com.epam.task.first.logic.creator;

import com.epam.task.first.creator.ArrayValidator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayValidatorTest {

    private final static String VALID_TEST_DATA = "23 4 1 4 -2 5";
    private final static String INVALID_TEST_DATA1 = "23b 4 1 4 -2 5";
    private final static String INVALID_TEST_DATA2 = "";
    private final static String INVALID_TEST_DATA3 = "bbbbbbb";

    @Test
    public void testValidateWhenValidDataApplied()
    {
        //given
        ArrayValidator validator = new ArrayValidator();

        //when
        boolean expected = validator.validate(VALID_TEST_DATA);

        //than
        Assert.assertTrue(expected);
    }

    @Test
    public void testValidateWhenDataContainsLetters()
    {
        //given
        ArrayValidator validator = new ArrayValidator();

        //when
        boolean expected = validator.validate(INVALID_TEST_DATA1);

        //than
        Assert.assertFalse(expected);
    }
    @Test
    public void testValidateWhenDataIsEmpty()
    {
        //given
        ArrayValidator validator = new ArrayValidator();

        //when
        boolean expected = validator.validate(INVALID_TEST_DATA2);

        //than
        Assert.assertFalse(expected);
    }

    @Test
    public void testValidateWhenDataContainsOnlyLetters()
    {
        //given
        ArrayValidator validator = new ArrayValidator();

        //when
        boolean expected = validator.validate(INVALID_TEST_DATA3);

        //than
        Assert.assertFalse(expected);
    }
}
