package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To1Then2() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax10To2Then2() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMaxOtr10ToOtr2ThenOtr2() {
        int left = -10;
        int right = -2;
        int result = Max.max(left, right);
        int expected = -2;
        Assert.assertEquals(expected, result);
    }
}