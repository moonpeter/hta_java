package day09_1127.ex04;

import day09_1127.ex03_geometry_polygon.Rectangle;

public class Ex01 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2,3);

        System.out.println("가로 = " + obj.width);
        System.out.println("세로 = " + obj.height);
        System.out.println("면적 = " + obj.getArea());

    }
}
