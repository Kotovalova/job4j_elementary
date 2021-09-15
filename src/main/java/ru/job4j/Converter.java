package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return  value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        float in = 420;
        float euro = Converter.rubleToEuro(in);
        System.out.println(in + " rubles are " + euro + " euro.");
        float expected1 = 6;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected1 == out;
        System.out.println(in + " rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(in);
        System.out.println(in + " rubles are " + dollar + " dollar.");
        float expected2 = 7;
        out = Converter.rubleToDollar(in);
        passed = expected2 == out;
        System.out.println(in + " rubles are 2. Test result : " + passed);
    }
}
