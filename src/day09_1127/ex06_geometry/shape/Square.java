package day09_1127.ex06_geometry.shape;

import day09_1127.ex06_geometry.common.Polygon;

public class Square extends Polygon {
    public Square(int x, int y, int sideLength) {
        super(x);
        setPoint(0, x, y);
        setPoint(1, x+sideLength, y);
        setPoint(2, x+sideLength, y+sideLength);
        setPoint(3, x, y+sideLength);
    }

    public int getX(int idx) {
        return x[idx];
    }

    public int getY(int idx) {
        return y[idx];
    }
}
