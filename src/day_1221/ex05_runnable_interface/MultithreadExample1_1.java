package day_1221.ex05_runnable_interface;

public class MultithreadExample1_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for(char ch='a'; ch<='z'; ch++){
                    System.out.print(ch);
                }
            }
        });
        thread.start();
        char arr[] = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ','ㅌ', 'ㅍ', 'ㅎ'};
        for (char ch : arr)
            System.out.print(ch);
    }
}
