package day_1221.ex08_syn_problem;

public class TransferThread extends Thread{
    private SharedArea sharedArea;

    TransferThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for(int cnt = 0; cnt<12; cnt++) {
            sharedArea.getAccount1().withdraw(1000000);
            System.out.print("이몽룡 계좌 : 100만원 인출,");
            sharedArea.getAccount2().deposit(1000000);
            System.out.print("성춘향 계좌 : 100만원 입금");
        }
    }
}
