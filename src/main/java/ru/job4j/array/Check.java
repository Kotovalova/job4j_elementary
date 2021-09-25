package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean res = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != res) {
                return false;
            }
        }
        return true;
    }
}
