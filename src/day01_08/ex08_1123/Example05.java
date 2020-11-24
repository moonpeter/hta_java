package day01_08.ex08_1123;

import java.util.Scanner;

public class Example05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int inputdata = sc.nextInt();
		abs(inputdata);
		System.out.println("절대값 : " + inputdata);
		sc.close();
	}
	
	public static int abs(int inputdata) {
		if (inputdata < 0) {
			inputdata = -inputdata;
		}
		return inputdata;
	}

}
