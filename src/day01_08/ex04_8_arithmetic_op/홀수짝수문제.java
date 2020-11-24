package day01_08.ex04_8_arithmetic_op;

//import java.io.InputStream;
import java.util.Scanner;

public class 홀수짝수문제 {
	public static void main(String args[]) {
//		InputStream is = System.in;
//		Scanner sc = new Scanner(is);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수를 입력 하세요>");
		int num = sc.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		};
	}
}
