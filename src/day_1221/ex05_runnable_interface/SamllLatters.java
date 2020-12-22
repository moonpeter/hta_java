package day_1221.ex05_runnable_interface;

public class SamllLatters implements Runnable{
    public void run() {
        for(char ch='a'; ch<='z'; ch++){
            System.out.print(ch);
        }
    }
}
