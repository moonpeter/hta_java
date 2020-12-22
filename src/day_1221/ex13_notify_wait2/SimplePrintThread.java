package day_1221.ex13_notify_wait2;

public class SimplePrintThread extends Thread{
    private SharedArea sharedArea;

    public SimplePrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }


    public void run() {
        if (sharedArea.isReady() != true) { //파이가 계산을 하고 있는 중인 경우
            try {
                synchronized (sharedArea) {
                    sharedArea.wait(); // 다른 스레드로 부터 신호를 기다립니다.
                }
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("SimplePrintThread : %.2f %n", sharedArea.getResult());
    }
}
