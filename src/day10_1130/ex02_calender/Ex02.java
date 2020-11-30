package day10_1130.ex02_calender;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        String[] yoil = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String ampm = "오후";

        if (today.get(Calendar.HOUR_OF_DAY) < 12) {
            ampm = "오전";
        }

        System.out.printf("%d년 %d월 %d일 %s%d:%d:%d %s입니다.", today.get(Calendar.YEAR),
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE),
                ampm,
                today.get(Calendar.HOUR),
                today.get(Calendar.MINUTE),
                today.get(Calendar.SECOND),
                yoil[today.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
