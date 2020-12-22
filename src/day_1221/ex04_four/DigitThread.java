package day_1221.ex04_four;

public class DigitThread extends Thread{
    public void run() {
        for (int cnt=0; cnt<10; cnt++) {
            System.out.print(cnt);
            try {
                Thread.sleep(1000); // 1초
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
