package ex5;

import java.util.Scanner;

public class LogicalExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("수를 입력하세요>");
		num = sc.nextInt();
		
		if (num>=1 && num<=10) {
			System.out.println("1~10사이의 수 입니다. ");
		} else {
			System.out.println("1~10사이의 수가 아닙니다.");
		}
		
		sc.close();
	}

}
