package day_1221.ex11_sys_format2;

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
