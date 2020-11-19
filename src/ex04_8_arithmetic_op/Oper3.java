package ex04_8_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper3 {
	public static void main(String args[]) {
		InputStream is = System.in;
		
		Scanner	sc   =	new 	Scanner(is);
		System.out.printf("정수를 입력 하세요>");
		int a = sc.nextInt();
		
		
		System.out.printf("정수를 입력하세요>");
		int b = sc.nextInt();

		int c = a + b;
		System.out.printf("%d + %d = %d",a,b,c);
		System.out.println();

		int d = a - b;
		System.out.printf("%d - %d = %d",a,b,d);
		System.out.println();

		int e = a * b;
		System.out.printf("%d * %d = %d",a,b,e);
		System.out.println();
		
		int f = a / b;
		System.out.printf("%d / %d = %d",a,b,f);

		sc.close();		
	}
}
