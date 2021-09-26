package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3min82() {
        int[] data = new int[] {3, -8, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-8, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3min82153() {
        int[] data = new int[] {3, -8, 2, 15, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-8, 2, 3, 3, 15};
        Assert.assertArrayEquals(expected, result);
    }
}