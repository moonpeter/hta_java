package day01_08.ex08_1123;

import java.util.Scanner;

public class Example06 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번재 값을 입력하세요 > ");
//		int inputdata1 = sc.next();
		int[] inputdata1 = {1, 2, 3, 4, 5};
		System.out.println("최대값 : " + max(inputdata1));
		System.out.println("최소값 : " + min(inputdata1));
		sc.close();
	}
	
	public static int max(int[] data) {
		int result = 0;
		for (int i = 1; i < 5; i++) {
			if (data[0] > data[i]) {
				result = data[0];
			} else {
				result = data[i];
			}
		}
		return result;
	}
	
	public static int min(int[] data) {
		int result = 0;
		for (int i = 1; i < 5; i++) {
			if (data[0] < data[i]) {
				result = data[0];
			} else {
				result = data[i];
			}
		}
		return result;
	}
}
