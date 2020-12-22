package day_1221.ex13_notify_wait2;

public class MultithreadExample {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();

        CalcThread thread1 = new CalcThread(sharedArea);
        PrintThread thread2 = new PrintThread(sharedArea);
        LuxuryPrintThread thread3 = new LuxuryPrintThread(sharedArea);
        SimplePrintThread thread4 = new SimplePrintThread(sharedArea);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
