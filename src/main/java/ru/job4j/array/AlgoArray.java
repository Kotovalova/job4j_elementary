package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp;
        /* поменяла 0 и 3 элементы массива */
        temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        /* поменяла 1 и 2 элементы массива */
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        /* поменяла 3 и 4 элементы массива */
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        for (int ar : array) {
            System.out.println(ar);
        }
    }
}
