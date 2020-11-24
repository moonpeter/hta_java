package ex09_1124_private_field;

import java.util.Scanner;

public class Ex02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력하세요. > ");
        double inputdata = sc.nextDouble();

        Circle2 obj = new Circle2(inputdata);

        System.out.println("반지름 " + obj.getRadius() + "의 넓이는 ? " + obj.getArea());

        sc.close();
    }
}
