package ru.job4j.condition;

public class ChessBoard {
    public static boolean include(int a) {
        return (a >= 0 & a <= 7);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1) & include(x1) & include(x2) & include(y1) & include(y2)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static void main(String[] args) {
       int a = 7;
       System.out.println(include(a));
    }

}
