package day_1221.ex01;

public class DigitThread extends Thread{
    public void run() {
        for (int cnt = 0; cnt < 10; cnt++)
            System.out.print(cnt);

        System.out.println("스레드 이름2 : " + Thread.currentThread().getName());
    }
}
