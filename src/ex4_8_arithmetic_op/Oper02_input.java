package ex4_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;


public class Oper02_input {
	public static void main(String[] args) {
		// System.in은 키보드로 데이터를 입력 받을 때 사용합니다.
		InputStream is = System.in;
		
//		클래스명	참조형변수	연산자	생성자 호출
		Scanner	sc   =	new 	Scanner(is);
		System.out.println("정수를 입력 하세요>");
		int a = sc.nextInt();
		
		System.out.println("입력값은" + a + "입니다.");
		
		System.out.println("정수를 입력하세요>");
		int b = sc.nextInt();
		
		System.out.println("입력값은" + b + "입니다.");
		sc.close();
	}
}
