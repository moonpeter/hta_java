package day01_05.ex03;

public class Variable1 {
	public static void main(String[] args) {
		System.out.println("===========정수형 변수==========");
		// 정수형 변수
		byte b = 10;	//1바이트(작은 범위의 값을 저장하기에 유용하다.)
		short s = 100;	//2바이트
		int i = 1000;	//4바이트
		
		// 8바이트([소문자 엘] 또는 L을 숫자 뒤에 붙임)
		long l = 100000L;
		System.out.println(b);
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i + " l=" + l);
		
		System.out.println("===========실수형 변수=========");
		float ft = 3.14f;
		
		double d = 42.195d;
		System.out.println("f=" + ft + " d=" + d);
		
		System.out.println("============문자형 변수========");
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형으로
		// 16비트의 유니코드를 사용합니다.
		char c1 = 'A';
		char c2 = '@';
		char c3 = '가';
		System.out.println("c1=" + c1 + " c2=" + c2 + " c3=" + c3);
		
		char c4 = 65;			// 영문 'A'를 의미
		char c5 = '\uAC00';		// 한글 유니코드 '가'를 의
		System.out.println("c4=" + c4 + " c5=" + c5);
		
		char c6 = 0101;
		char c7 = 0x41;
		char c8 = 0b00001000001;
		System.out.println("8진수 0101=" + c6 + "\n" + "16진수 0x41=" + c7 +  "\n 2진수 0b00001000001=" + c8);
		
		System.out.println("============논리형 변수==========");
		// 논리형 변수
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1은 참인" + b1);
		System.out.println("B2은 거짓인" + b2);
	}
}