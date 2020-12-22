package day_1221.ex10_syn_format1;

public class PrintThread extends Thread{
    private SharedArea sharedArea;

    PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int i=0; i<3; i++) {
            int sum = sharedArea.getTotal();
                System.out.println("계좌 잔액 합계 = " + sum);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
