package day_1221.ex07_Sharedarea_solution;

public class PrintThread extends Thread{
    private SharedArea sharedArea;

    PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        // SharedArea 객체의 isReady 필드 값이 true 될 때까지 반복
        while (sharedArea.isReady() != true) {
            System.out.println("실행중~!!!");
        }
        //공유 영역의 데이터 출력합니다.
        System.out.println("공유영역 데이터는 = " + sharedArea.getResult());
    }
}
