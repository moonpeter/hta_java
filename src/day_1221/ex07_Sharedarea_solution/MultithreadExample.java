package day_1221.ex07_Sharedarea_solution;

public class MultithreadExample {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();

        CalcThread thread1 = new CalcThread(sharedArea);
        PrintThread thread2 = new PrintThread(sharedArea);

        thread1.start();
        thread2.start();
    }
}
