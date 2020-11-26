package day01_05.ex04_8_concate;

import java.util.Scanner;

public class 문제_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요.");
		int num_1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요.");
		int num_2 = sc.nextInt();
		
		if (num_1 == num_2) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println("다른 수 입니다.");
		}
		
		if (num_1 > num_2) {
			System.out.println(num_1);
		} else {
			System.out.println(num_2);
		}
		
		sc.close();
	}
}
