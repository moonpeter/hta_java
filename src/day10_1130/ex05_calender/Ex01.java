package day10_1130.ex05_calender;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요 >");
        int y = sc.nextInt();
        System.out.println("월을 입력하세요 >");
        int m = sc.nextInt();

        Calendar today = new GregorianCalendar(y, m-1, 1);
        System.out.println("***" + today.get(Calendar.YEAR) + "/" + (today.get(Calendar.MONTH)+1) + "/"  + today.get(Calendar.DATE));
        int start_d = today.get(Calendar.DAY_OF_WEEK);
        int end_d = today.getActualMaximum(Calendar.DATE);

        System.out.printf("%d년 %d월\n", y, m);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i<7; i++) {
            if (start_d==i){
                for (int j=1; j<i; j++)
                System.out.print("\t");
            }
        }
        for (int k=0; k<end_d; k++) {
            System.out.print(k+1 + "\t");
            if (k%7 == 7 -(start_d)) {
                System.out.println();
            }
        }

        sc.close();
    }
}
