package ex4_8_concate;

import java.util.Scanner;

public class 문제_03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.");
		String input_str = sc.next();
		
		if (input_str.equals("java")) {
			System.out.println("이름이 일치합니다.");
		} else {
			System.out.println("다시 생각해 보세요");
		}
		
		sc.close();
	}
}
