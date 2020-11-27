package day09_1127.ex05;

import day09_1127.ex03_geometry_polygon.*;

public class Ex01 {
    public static void main(String[] args) {
        Square obj1 = new Square(7);
        Rectangle obj2 = new Rectangle(5, 10);

        if (obj1.getArea() > obj2.getArea()){
            System.out.println("정사각형의 면적이 더 넓습니다.");
        } else {
            System.out.println("정사각형의 면적은 직사각형의 면적보다 작거나 같습니다.");
        }
    }
}
