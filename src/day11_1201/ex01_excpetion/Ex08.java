package day11_1201.ex01_excpetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        try {
            int input_num = sc.nextInt();
            System.out.println("입력한 데이터 : " + input_num);
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요");
        } finally {
            sc.close();
        }
    }
}
