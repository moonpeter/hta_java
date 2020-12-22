package day_1221.ex03_thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run() {
                for (int cnt=0; cnt<10;) {
                    SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy년 MM월dd일 E요 HH시mm분ss초");
                    Date time = new Date();
                    String time1 = format1.format(time);
                    System.out.println(time1);
                    try {
                        Thread.sleep(1000); // 1초
                    }catch (InterruptedException e) {
                        // sleep메소드가 발생시키는 InterruptedException 처리하는 문장
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
        thread.start();
    }
}