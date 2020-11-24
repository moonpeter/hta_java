package day01_08.ex07_1120;

import java.util.Scanner;

public class ArrayExample10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int data[] = new int[5];
		
		for (int idx = 0; idx < data.length; idx++) {
			System.out.printf("%d번째 값을 입력하세요>", idx+1);
			data[idx] = sc.nextInt();
		}
		
		int max = data[0];
		int min = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
			if (min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		sc.close();
	}
	
}

