package day01_05.ex08_1123;

import java.util.Scanner;

public class Example11_change_num {
	public static void main(String args[]) {
		int n1, n2, tmp;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 > ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		tmp = n1;
		n1 = n2;
		n2 = tmp;
		System.out.println(n1);
		System.out.println(n2);
		sc.close();
	}
}
