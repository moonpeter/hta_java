package day09_1124.arrangement;

public class Numbers {
    private int num[];

    Numbers(int num[]) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return total;
    }

    public int getAverage() {
        return getTotal() / num.length;
    }
}
