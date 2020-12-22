package day_1221.ex01;

public class MultithreadExample1 {
    public static void main(String[] args) {
        Thread thread = new DigitThread();  // 쓰레드를 생성

        // thread를 실행시킵니다.
        thread.start();

        for (char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print(ch);

        System.out.println("스레드 이름 : " + Thread.currentThread().getName());
    }
}
