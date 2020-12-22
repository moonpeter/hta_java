package day_1221.ex12_notify_wait;


public class PrintThread extends Thread{
    SharedArea sharedArea = new SharedArea();

    public PrintThread(SharedArea sharedArea) {
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
        System.out.println(sharedArea.getResult());
    }
}
