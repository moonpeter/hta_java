package day_1221.ex03_thread_sleep;

public class MultithreadExample {
    public static void main(String[] args) {
        Thread thread = new DigitThread();
        thread.start();
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch);
            try {
                Thread.sleep(1000);
                // sleep 메소드 : 일정 시간이 경과되기를 기다리는 메소드.
                // public static void sleep(long millis) throws InterruptedException {}
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
