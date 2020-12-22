package day_1221.ex04_four;

public class AlpahbetThread extends Thread{
    public void run() {
        for (char ch='A'; ch<='Z'; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
