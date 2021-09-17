package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isEven(num);
    }

    public static void main(String[] args) {
        boolean result = isEven(2);
        System.out.println(result);
        result = isPositive(2);
        System.out.println(result);
        result = notEven(2);
        System.out.println(result);
        result = notPositive(2);
        System.out.println(result);
        result = notEvenAndPositive(2);
        System.out.println(result);
        result = evenOrNotPositive(2);
        System.out.println(result);
    }
}
