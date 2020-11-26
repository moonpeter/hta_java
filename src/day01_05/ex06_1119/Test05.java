package day01_05.ex06_1119;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두수와 사칙연산 연산자를 입력하세요>");

		int num_1, num_2;
		int result = 0;
		String op, no;
		do {
			System.out.print("수1>");
			num_1 = sc.nextInt();
			System.out.print("수2>");
			num_2 = sc.nextInt();
			System.out.print("연산>");
			op = sc.next();
		
			switch (op) {
			case "+":
				result = num_1 + num_2;
				System.out.println(num_1 + "+" + num_2 + "=" + result);
				break;
			case "-":
				result = num_1 - num_2;
				System.out.println(num_1 + "-" + num_2 + "=" + result);
				break;
			case "*":
				result = num_1 * num_2;
				System.out.println(num_1 + "*" + num_2 + "=" + result);
				break;
			case "/":
				result = num_1 / num_2;
				System.out.println(num_1 + "/" + num_2 + "=" + result);
				break;
			case "%":
				result = num_1 % num_2;
				System.out.println(num_1 + "%" + num_2 + "=" + result);
				break;
			default:
				System.out.println(" \"+, -, *, /, %\" 중 한개를 입력하세요. ");
			}
			no = sc.next();
		} while (!(no.equals("n") || no.equals("N")));
		System.out.println("End!!!!");
		sc.close();
	}
}
