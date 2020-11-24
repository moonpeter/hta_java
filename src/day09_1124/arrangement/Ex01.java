package day09_1124.arrangement;

import java.util.Scanner;

public class Ex01 {
    public static void main(String args[]) {
        int num[] = {10, 20, 30, 40, 50};
        Numbers obj = new Numbers(num);

        System.out.println(obj.getTotal());
        System.out.println(obj.getAverage());

        Numbers obj2 = new Numbers(new int[] {50, 40, 30, 20, 10});

        System.out.println(obj2.getTotal());
        System.out.println(obj2.getAverage());

        Scanner sc = new Scanner(System.in);
        int inputdata[] = new int[5];
        for (int i=0; i<inputdata.length; i++) {
            System.out.println(i+1 + "번째 정수를 입력하세요>");
            inputdata[i] = sc.nextInt();
        }
        Numbers obj_input = new Numbers(inputdata);
        System.out.println(obj_input.getTotal());
        System.out.println(obj_input.getAverage());
    }
}
