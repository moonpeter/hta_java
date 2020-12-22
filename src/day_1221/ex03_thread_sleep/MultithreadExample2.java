package day_1221.ex03_thread_sleep;

public class MultithreadExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run() {
                for (int cnt=0; cnt<10; cnt++) {
                    System.out.print(cnt);
                    try {
                        Thread.sleep(500); // 0.5초
                    }catch (InterruptedException e) {
                        // sleep메소드가 발생시키는 InterruptedException 처리하는 문장
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
        thread.start();
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch);
            try {
                Thread.sleep(500);
                // sleep 메소드 : 일정 시간이 경과되기를 기다리는 메소드.
                // public static void sleep(long millis) throws InterruptedException {}
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
