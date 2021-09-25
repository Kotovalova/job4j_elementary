package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int min;
        int mini = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    mini = j;
                    min = array[j];
                }
            }
            temp = array[i];
            array[i] = array[mini];
            array[mini] = temp;
        }

        for (int ar : array) {
            System.out.println(ar);
        }
    }
}
