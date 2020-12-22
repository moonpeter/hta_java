package day_1221.ex10_syn_format1;

public class TransferThread extends Thread {
    private SharedArea sharedArea;

    TransferThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int cnt = 0; cnt < 12; cnt++) {
            sharedArea.transfer();
        }
    }
}
