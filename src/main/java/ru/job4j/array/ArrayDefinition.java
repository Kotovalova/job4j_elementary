package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Петр";
        names[1] = "Василий";
        names[2] = "Руслан";
        names[3] = "Павел";
        int b = names.length;
        for (int i = 0; i < b; i++) {
            System.out.println(names[i]);
        }
    }
}
