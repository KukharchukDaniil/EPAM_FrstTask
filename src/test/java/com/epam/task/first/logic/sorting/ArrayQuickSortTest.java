package com.epam.task.first.logic.sorting;

import com.epam.task.first.entities.Array;
import com.epam.task.first.sorting.ArrayQuickSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayQuickSortTest {

    @Test
    public void testQuickSortWhenArrayIsEmpty()
    {
        //given
        Array array = new Array();
        ArrayQuickSort arrayQuickSort = new ArrayQuickSort();
        //when
        Array actual = arrayQuickSort.sort(array);
        //than
        Assert.assertEquals(array,actual);
    }
    @Test
    public void testQuickSortWhenArrayIsFull()
    {
        //given
        Array array = new Array(-1,5,163,1,7643,23,5);
        ArrayQuickSort arrayQuickSort = new ArrayQuickSort();
        //when
        Array actual = arrayQuickSort.sort(array);
        Array expected = new Array(-1,1,5,5,23,163,7643);
        //than
        Assert.assertEquals(expected,actual);
    }
}
