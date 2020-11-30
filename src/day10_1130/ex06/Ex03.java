package day10_1130.ex06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
    public static void main(String[] args) {
        String start = "2020-11-1";
        String end = "2020-11-30";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date beginDate = dateFormat.parse(start);
            Date endDate = dateFormat.parse(end);

            System.out.println(beginDate);
            System.out.println(endDate);
            System.out.println(endDate.getTime());
            System.out.println(beginDate.getTime());
            long diff = endDate.getTime() - beginDate.getTime();
            long diff_day = diff / (24 * 60 * 60 * 1000);
            System.out.println(diff_day + "일이 지났습니다.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
