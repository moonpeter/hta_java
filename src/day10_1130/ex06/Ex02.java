package day10_1130.ex06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ex02 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 a h시 m분 s초 E요일");
        System.out.println(sdf.format(calendar.getTime()));
    }
}
