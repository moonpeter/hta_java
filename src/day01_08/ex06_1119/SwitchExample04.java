package day01_08.ex06_1119;

import java.util.Scanner;

public class SwitchExample04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1를 입력하세요>");
		int num_1 = sc.nextInt();
		System.out.print("정수2를 입력하세요>");
		int num_2 = sc.nextInt();
		System.out.print("연산자를 입력하세요>");
		String oprands = sc.next();

		int result;

		switch (oprands) {
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
		sc.close();
	}
}
