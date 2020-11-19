package ex06_1119;

import java.util.Scanner;

public class IfExample3_3_max_min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력하세요>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1이 제일 큽니다. num1 :" + num1);
		}
		else if (num2 > num3) {
			System.out.println("num2가 제일 큽니다. num2 :" + num2);
		}
		else {
			System.out.println("num3가 제일 큽니다. num3 :" + num3);
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("num1이 제일 작습니다. num1 :" + num1);
		}
		else if (num2 < num3) {
			System.out.println("num2가 제일 작습니다. num2 :" + num2);
		}
		else {
			System.out.println("num3가 제일 작습니다. num3 :" + num3);
		}
		sc.close();
	}
}
