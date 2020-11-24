package ex09_1124_Circle;

import java.util.Scanner;

public class Ex02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력하세요 > ");
        double r = sc.nextInt();

        Circle2 obj_r = new Circle2(r);

        System.out.println("반지름 " + obj_r.radius + "의 넓이는 ? " + obj_r.getArea());
    }
}
