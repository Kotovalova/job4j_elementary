package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder newstroka = new StringBuilder();
        int b = sb.length() - 1;
        for (int i = 0; i <= b; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                newstroka.append(ch);
            }
        }
        s = newstroka.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = Abbreviation.collect("North Atlantic Treaty Organization");
        System.out.println(s);
    }
}
