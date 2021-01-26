package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class ArrayLogicTest {
    private ArrayLogic arrayLogic = new ArrayLogic();
    Predicate<Double> predicate =  new Predicate<Double>() {
        @Override
        public boolean test(Double value) {
            return value%2==0.0;
        }
    };

    @Test
    public void testCheckArrayWhenArrayIsEmpty()
    {
        //given
        Array array = new Array();

        //when
        //...

        //than
        Assert.assertFalse(arrayLogic.checkArray(array));

    }
    @Test
    public void testCheckArrayWhenArrayIsNotEmpty()
    {
        //given
        Array array = new Array(120.0);

        //when
        //...

        //than
        Assert.assertTrue(arrayLogic.checkArray(array));

    }

    @Test
    public void testGetSumWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2.0,12.5,7.1);

        //when
        Double actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(21.6,actual);
///
    }

    @Test
    public void testGetSumWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2.0,-12.5,-7.1);

        //when
        Double actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(-21.6,actual);

    }

    @Test
    public void testGetSumWhenBothPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(2.0,-12.0,7.0);

        //when
        Double actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(-3.0,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2.0,12.5,7.1);

        //when
        Double actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(12.5,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2.0,-12.5,-7.1);

        //when
        Double actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(-2.0,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenBothPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(2.0,-12.5,7.1);

        //when
        Double actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(7.1,actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2.0,12.5,7.1);

        //when
        Double actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(2.0,actual);

    }

    @Test
    public void testFindMinWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2.0,-12.5,-7.1);

        //when
        Double actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(-12.5,actual);

    }

    @Test
    public void testFindMinWhenPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(2.0,-12.5,7.1);

        //when
        Double actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(-12.5,actual);

    }

    @Test
    public void testFindMeanWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2.0,0.5,0.5);

        //when
        Double actual = arrayLogic.findMean(array);

        //than
        Assert.assertEquals(1.0,actual);

    }

    @Test
    public void testFindMeanWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2.0,-0.5,-0.5);

        //when
        Double actual = arrayLogic.findMean(array);

        //than
        Assert.assertEquals(-1.0,actual);

    }

    @Test
    public void testFindMeanWhenBothNegativeAndPositiveNumbersApplied()
    {
        //given
        Array array = new Array(-3.0,0.5,-0.5);

        //when
        Double actual = arrayLogic.findMean(array);

        //than
        Assert.assertEquals(-1.0,actual);

    }

    @Test
    public void testCountPositiveWhenBothNegativeAndPositiveNumbersApplied()
    {
        //given
        Array array = new Array(-3.0,0.5,-0.5);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(1,actual);

    }
    @Test
    public void testCountPositiveWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(3.0,0.5,0.5);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(3,actual);

    }
    @Test
    public void testCountPositiveWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3.0,-0.5,-0.5);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(0,actual);

    }

    @Test
    public void testCountNegativeWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(3.0,0.5,0.5);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(0,actual);

    }
    @Test
    public void testCountNegativeWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3.0,-0.5,-0.5);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(3,actual);

    }

    @Test
    public void testCountNegativeWhenPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3.0,0.5,-0.5, 0.0);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(2,actual);

    }

    @Test
    public void testReplaceIfGreaterWhenAllNumbersAreProper()
    {
        //given
        Array array = new Array(14.0,124.0,0.0, 0.0);

        //when
        arrayLogic.replaceIf(array,predicate, 512.0);

        //than

        Assert.assertEquals(new Array(512.0,512.0,512.0, 512.0),array);
    }

    @Test
    public void testReplaceIfGreaterWhenAllNumbersAreNotProper()
    {
        //given
        Array array = new Array(15.0,123.0,1.0, 1.0);

        //when
        arrayLogic.replaceIf(array,predicate, 512.0);

        //than
        Assert.assertEquals(new Array(15.0,123.0,1.0, 1.0),array);

    }

    @Test
    public void testReplaceIfGreaterWhenSomeNumbersAreProper()
    {
        //given
        Array array = new Array(15.0,124.0,1.0, 1.0);

        //when
        arrayLogic.replaceIf(array,predicate, 512.0);

        //than
        Assert.assertEquals(new Array(15.0,512.0,1.0, 1.0),array);

    }

}
