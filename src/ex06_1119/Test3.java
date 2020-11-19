package ex06_1119;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.print("점수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int share = score / 10;
		switch (share) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

		sc.close();
	}

}
