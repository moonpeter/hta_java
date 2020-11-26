package day01_05.ex05_1118;

import java.util.Scanner;

public class LogicalExample03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인의 나이를 입력하세요>");
		int input_num = sc.nextInt();
		
		int ten = input_num / 10;
		int ten_10 = ten * 10;
		
		if ( (input_num - ten_10) > 0 ) {
			System.out.println(ten_10 + "대");
		} else {
			System.out.println(input_num + "대");
		}
		
//		if (0 <= input_num && input_num < 10) {
//			System.out.println("10세 미만");
//		} else if (9 < input_num && input_num < 20) {
//			System.out.println("10대");
//		} else if (19 < input_num && input_num < 30) {
//			System.out.println("20대");
//		} else if (29 < input_num && input_num < 40) {
//			System.out.println("30대");
//		} else if (39 < input_num && input_num < 50) {
//			System.out.println("40대");
//		} else {
//			System.out.println("50대 이상");
//		}
		sc.close();
	}
}
