package day_1221.ex04_four;

public class MultithreadExample {
    public static void main(String[] args) {
        Thread thread1 = new DigitThread();
        Thread thread2 = new DigitThread();
        Thread thread3 = new AlpahbetThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
