package day01_05.ex06_1119;

import java.util.Scanner;

public class DoWhileExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String location = "";
		System.out.println("지역입력(exit=q)>");
		location = sc.next();
		do {
			System.out.println("지역입력(exit=q)>");
			location = sc.next();
		} while( !location.equals("q"));
		System.out.println("End!!!!");
		sc.close();
	}	
}
