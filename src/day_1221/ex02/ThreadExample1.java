package day_1221.ex02;

import java.util.Scanner;

public class ThreadExample1 {
    public static void main(String[] args) {
        System.out.println("아무거나 입력하세요");
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하신 내용은 \'" + sc.nextLine() + "\' 입니다.");
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
