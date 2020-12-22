package day_1221.ex09_syn_solution;

public class PrintThread extends Thread{
    private SharedArea sharedArea;

    PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int i=0; i<3; i++) {
            synchronized (sharedArea) {
                int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
                System.out.println("계좌 잔액 합계 = " + sum);
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
