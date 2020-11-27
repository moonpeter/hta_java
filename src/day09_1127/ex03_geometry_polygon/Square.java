package day09_1127.ex03_geometry_polygon;

public class Square {
    public int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }
}
