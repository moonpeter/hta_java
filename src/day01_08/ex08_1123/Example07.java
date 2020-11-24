package day01_08.ex08_1123;

import java.util.Scanner;

public class Example07 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] inputdata = new int[5];
		for (int i=0; i < inputdata.length; i++) {
			System.out.println(i+1 + "번재 값을 입력하세요 > ");
			inputdata[i] = sc.nextInt();
		}
		
		System.out.println("최대값 : " + max(inputdata));
		System.out.println("최소값 : " + min(inputdata));
		sc.close();
	}
	
	public static int max(int[] inputdata) {
		int result = inputdata[0];
		for (int i=1; i < inputdata.length; i++) {
			if (inputdata[0] < inputdata[i]) {
				result = inputdata[i];
			} 
		}
		return result;
	}
	
	public static int min(int[] inputdata) {
		int result = inputdata[0];
		for (int i=1; i < inputdata.length; i++) {
			if (inputdata[0] > inputdata[i]) {
				result = inputdata[i];
			} 
		}
		return result;
	}
}
