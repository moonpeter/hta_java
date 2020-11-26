package day01_05.ex05_1118;

import java.util.Scanner;

public class LogicalExample04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("수를 입력하세요>");
		num = sc.nextInt();
		
		if(num ==1 || num==11) {
			System.out.println("1 또는 11입니다.");
		} else {
			System.out.println("1 또는 11이 아닙니다.");
		}
		sc.close();
	}
}
