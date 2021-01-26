package com.epam.task.first.logic.sorting;

import com.epam.task.first.entities.Array;
import com.epam.task.first.sorting.ArrayCombSort;
import com.epam.task.first.sorting.ArrayQuickSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayCombSortTest {
    @Test
    public void testCombSortWhenArrayIsEmpty()
    {
        //given
        Array array = new Array();
        ArrayCombSort arrayCombSort = new ArrayCombSort();
        //when
        Array actual = arrayCombSort.sort(array);
        //than
        Assert.assertEquals(array,actual);
    }
    @Test
    public void testCombSortWhenArrayIsFull()
    {
        //given
        Array array = new Array(-1,5,163,1,7643,23,5);
        ArrayCombSort arrayCombSort = new ArrayCombSort();
        //when
        Array actual = arrayCombSort.sort(array);
        Array expected = new Array(-1,1,5,5,23,163,7643);
        //than
        Assert.assertEquals(expected,actual);
    }
}
