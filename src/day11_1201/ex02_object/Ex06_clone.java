package day11_1201.ex02_object;

import java.util.GregorianCalendar;

public class Ex06_clone {
    public static void main(String[] args) {
        GregorianCalendar obj1 = new GregorianCalendar(2020, 11, 1);

        Object imsi = obj1.clone();
        GregorianCalendar obj2 = (GregorianCalendar)imsi;

        System.out.printf("%tF %n", obj1);
        System.out.printf("%tF %n", obj2);

        obj1.set(2021, 3, 28);
        System.out.printf("%tF %n", obj1);
        System.out.printf("%tF %n", obj2);
    }
}
