package day01_05.ex08_1123;

import java.util.Scanner;

public class Example08 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] inputdata = new int[5];
		for (int i = 0; i < inputdata.length; i++) {
			System.out.println(i + 1 + "번재 값을 입력하세요 > ");
			inputdata[i] = sc.nextInt();
		}
		int[] result = maxAndMin(inputdata);
		System.out.println("최대값 : " + result[0]);
		System.out.println("최소값 : " + result[1]);
		sc.close();
	}

	public static int[] maxAndMin(int[] inputdata) {
		int[] results = { inputdata[0], inputdata[0] };
		for (int i = 1; i < inputdata.length; i++) {
			if (results[0] < inputdata[i]) {
				results[0] = inputdata[i];
			}
			if (results[1] > inputdata[i]) {
				results[1] = inputdata[i];
			}
		}
//		for (int i = 1; i < inputdata.length; i++) {
//			if (inputdata[0] > inputdata[i]) {
//				results[1] = inputdata[i];
//			}
//		}
		return results;
	}
}
