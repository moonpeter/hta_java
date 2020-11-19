package ex06_1119;

import java.util.Scanner;

public class ForExample04_3dan_2 {
	public static void main(String[] args) {
		int dan, i, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("출력을 원하는 단수를 일력해주세요>");
		dan = sc.nextInt();
		System.out.println("[" + dan + "단]");
		for (i = 1; i < 10; i++) {
			result = dan * i;
			System.out.printf("%d * %d = %d / ", dan, i, result);
			sc.close();
		}
	}
}