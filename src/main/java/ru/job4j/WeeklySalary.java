package ru.job4j;

public class WeeklySalary {
    public static int weekday(int hours) {
        int salary;
        if (hours > 8) {
            salary = (hours - 8) * 15 + 8 * 10;
        } else if (hours > 0) {
            salary = hours * 10;
        } else {
            salary = 0;
        }
        return salary;
    }

    public static int weekends(int hours) {
        int salary;
        if (hours > 8) {
            salary = ((hours - 8) * 15 + 8 * 10) * 2;
        } else if (hours > 0) {
            salary = (hours * 10) * 2;
        } else {
            salary = 0;
        }
        return salary;
    }

    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + weekday(hours[i]);
        }
        for (int i = 5; i < 7; i++) {
            sum = sum + weekends(hours[i]);
        }
        return sum;
    }

}
