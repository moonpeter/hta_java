package day09_1127.ex06_geometry;

import day09_1127.ex06_geometry.common.Polygon;
import day09_1127.ex06_geometry.shape.Square;

public class Ex01 {
    public static void main(String[] args) {
        Square obj = new Square(100, 200, 15);

        for (int i = 0; i < 5; i++){
            print(i, obj);
        }
    }

    static void print(int i, Square obj) {
        System.out.printf("X[%d] = %d, X[%d]=%d\n", i, obj.getX(i), i, obj.getY(i));
    }
}
