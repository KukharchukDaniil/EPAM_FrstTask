package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class ArrayLogicTest {
    private final ArrayLogic arrayLogic = new ArrayLogic();
    Predicate<Integer> condition =  new Predicate<Integer>() {
        @Override
        public boolean test(Integer value) {
            return value%2==0;
        }
    };


    @Test
    public void testGetSumWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2,12,7);

        //when
        int actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(21,actual);
///
    }

    @Test
    public void testGetSumWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,-12,-7);

        //when
        int actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(-21,actual);

    }

    @Test
    public void testGetSumWhenBothPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(2,-12,7);

        //when
        int actual = arrayLogic.getSum(array);

        //than
        Assert.assertEquals(-3,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2,12,7);

        //when
        int actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(12,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,-15,-7);

        //when
        int actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(-2,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenBothPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,15,-7);

        //when
        int actual = arrayLogic.findMax(array);

        //than
        Assert.assertEquals(15,actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2,15,7);

        //when
        int actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(2,actual,0.00001);

    }

    @Test
    public void testFindMinWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,-15,-7);

        //when
        int actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(-15,actual);

    }

    @Test
    public void testFindMinWhenPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,-15,-7);

        //when
        int actual = arrayLogic.findMin(array);

        //than
        Assert.assertEquals(-15,actual);

    }

    @Test
    public void testFindAverageWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(2,3,7);

        //when
        Double actual = arrayLogic.getAverage(array);

        //than
        Assert.assertEquals(4.0,actual,0.00001);

    }

    @Test
    public void testFindAverageWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-2,-15,-7);

        //when
        Double actual = arrayLogic.getAverage(array);

        //than
        Assert.assertEquals(-8.0,actual,0.00001);

    }

    @Test
    public void testFindAverageWhenBothNegativeAndPositiveNumbersApplied()
    {
        //given
        Array array = new Array(-3,1,-1);

        //when
        Double actual = arrayLogic.getAverage(array);

        //than
        Assert.assertEquals(-1,actual,0.00001);

    }

    @Test
    public void testCountPositiveWhenBothNegativeAndPositiveNumbersApplied()
    {
        //given
        Array array = new Array(-3,1,-1);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(1,actual);

    }
    @Test
    public void testCountPositiveWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(3,1,1);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(3,actual);

    }
    @Test
    public void testCountPositiveWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3,-1,-1);

        //when
        int actual = arrayLogic.countPositive(array);

        //than
        Assert.assertEquals(0,actual);

    }

    @Test
    public void testCountNegativeWhenPositiveNumbersApplied()
    {
        //given
        Array array = new Array(3,1,1);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(0,actual);

    }
    @Test
    public void testCountNegativeWhenNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3,-1,-1);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(3,actual);

    }

    @Test
    public void testCountNegativeWhenPositiveAndNegativeNumbersApplied()
    {
        //given
        Array array = new Array(-3,1,-1, 0);

        //when
        int actual = arrayLogic.countNegative(array);

        //than
        Assert.assertEquals(2,actual);

    }

    @Test
    public void testReplaceIfGreaterWhenAllNumbersAreProper()
    {
        //given
        Array array = new Array(14,124,0, 0);

        //when
        Array actual = arrayLogic.replaceIf(array,condition, 512);

        //than
        Assert.assertEquals(new Array(512,512,512, 512),actual);

    }

    @Test
    public void testReplaceIfGreaterWhenAllNumbersAreNotProper()
    {
        //given
        Array array = new Array(15,123,1, 1);

        //when
        Array actual = arrayLogic.replaceIf(array,condition, 512);

        //than
        Assert.assertEquals(new Array(15,123,1, 1),actual);

    }

    @Test
    public void testReplaceIfGreaterWhenSomeNumbersAreProper()
    {
        //given
        Array array = new Array(15,124,1, 1);

        //when
        Array actual = arrayLogic.replaceIf(array,condition, 512);

        //than
        Assert.assertEquals(new Array(15,512,1, 1),actual);

    }

}
