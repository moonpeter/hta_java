package day_1221.ex07_Sharedarea_solution;

public class SharedArea {
    private double result;

    public SharedArea() {
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    // 공유 데이터가 쓰여졌는지 여부를 표현하는 필드 - 디폴트(false)
    private boolean isReady;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }
}
