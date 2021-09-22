package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumWhen0and10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhenMin5and4ThenMin5() {
        int start = -5;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = -5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen0and10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhenMin5and4ThenMin5() {
        int start = -5;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}