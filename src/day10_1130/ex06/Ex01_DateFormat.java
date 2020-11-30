package day10_1130.ex06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01_DateFormat {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Date 사용 : " + d);

        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년MM월dd일E요일");
        System.out.println(sd1.format(d));
        System.out.println(sd2.format(d));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 m분 s초 E요일");
        System.out.println(sdf.format(d));
    }
}
