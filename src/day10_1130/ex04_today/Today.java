package day10_1130.ex04_today;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
    private Calendar today = new GregorianCalendar();

    public Today() {
    }

    public Today(GregorianCalendar today) {
        this.today = today;
    }

    public String toString() {
        String[] yoil = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String[] ampm = {"오전", "오후"};

        int y = today.get(Calendar.YEAR);
        int m = today.get(Calendar.MONTH) + 1;
        int d = today.get(Calendar.DATE);
        int ap = today.get(Calendar.AM_PM);
        int h = today.get(Calendar.HOUR);
        int min = today.get(Calendar.MINUTE);
        int s = today.get(Calendar.SECOND);
        String yo = yoil[today.get(Calendar.DAY_OF_WEEK) - 1];

        return y + "년 " + m + "월 " + d + "일 " + ampm[ap] + h + ":" + min + ":" + s + " " + yo + "입니다.";
    }
}
