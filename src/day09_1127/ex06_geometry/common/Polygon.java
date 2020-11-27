package day09_1127.ex06_geometry.common;

public class Polygon {
    public int[] x;
    protected int[] y;

    protected Polygon(int size){
        x = new int[size];
        y = new int[size];
    }

    protected void setPoint(int idx, int x, int y) {
        this.x[idx] = x;
        this.y[idx] = y;
    }
}
