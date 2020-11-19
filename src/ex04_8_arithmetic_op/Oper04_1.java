package ex04_8_arithmetic_op;

// 산술 연산자 %를 이용하여 입력한 정수의 짝수와 홀수를 구하는 프로그램

public class Oper04_1 {
	public static void main(String args[]) {
		int data = 11;
		int pandan = data % 2;
		System.out.println("data%2의 값은 " + pandan + "입니다.");
		
		if (pandan == 0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		};
	}
}
