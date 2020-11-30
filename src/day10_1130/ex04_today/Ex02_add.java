package day10_1130.ex04_today;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02_add {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();

        c.add(Calendar.DATE, 1);
        print(c);

        c.add(Calendar.MONTH, 1);
        print(c);

        c.add(Calendar.YEAR, 1);
        print(c);

        c.add(Calendar.DATE, -1);
        print(c);

        c.add(Calendar.MONTH, -1);
        print(c);

        c.add(Calendar.YEAR, -1);
        print(c);
    }

    private static void print(GregorianCalendar c) {
        Today t = new Today(c);
        System.out.println(t);
    }
}
