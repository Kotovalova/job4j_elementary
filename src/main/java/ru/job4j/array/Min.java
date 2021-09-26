package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int ar : array) {
            if (min > ar) {
                min = ar;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5};
        int min = findMin(array);
        System.out.println(min);
    }
}
