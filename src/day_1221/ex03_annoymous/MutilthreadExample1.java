package day_1221.ex03_annoymous;

public class MutilthreadExample1 {
    public static void main(String[] args) {
        // 익명의 자식 객체를 생성
        Thread thread = new Thread() {
            public void run() {
                for (int cnt = 0; cnt < 10; cnt++)
                    System.out.print(cnt);
            }
        };  // 쓰레드를 생성

        // 쓰레드를 실행
        thread.start();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
