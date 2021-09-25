package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = Integer.toString(i);
        int b = s.length() - 1;
        for (int index = 0; index <= b; index++) {
            if (s.charAt(index) != s.charAt(b - index)) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            boolean b = Symmetry.check(452354);
            System.out.println(b);
    }
}
