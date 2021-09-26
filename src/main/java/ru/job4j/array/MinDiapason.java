package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = -1;
        if (start >= 0 && start < array.length && finish >= 0 && finish < array.length) {
            min = array[start];
            for (int i = start; i <= finish; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }
}
