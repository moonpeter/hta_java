package day01_05.ex06_1119;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("점수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int share = score / 10;

		if (share == 9 || share == 10) {
			System.out.println("A");
		} else if (share == 8) {
			System.out.println("B");
		} else if (share == 7) {
			System.out.println("C");
		} else if (share == 6) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		sc.close();
	}

}
