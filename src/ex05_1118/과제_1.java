package ex05_1118;

import java.util.Scanner;

public class 과제_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3개의 정수를 입력하세요?");
		int max, min;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
				
		max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		
		min = n1 < n2 ? n1 : n2;
		min = min < n3 ? min : n3;

		System.out.println("max : " + max);
		System.out.println("min : " + min);		
		
		sc.close();
	}
}
