package ex04_8_arithmetic_op;

public class Oper01_0 {
	public static void main(String args[]) {
		// 정수형(int) 변수 a, b, c를 선언합니다.
		
		//a=10, b=4로 초기화 합니다.
		int a = 10, b = 4, c;
		
		c = a + b;	//c=14;
		System.out.println(a + "+" + b + "=" +c);
		
		c = a - b;	//c=6;
		System.out.println(a + "-" + b + "=" +c);

		c = a * b;	//c=40;
		System.out.println(a + "*" + b + "=" +c);
		
		c = a / b;
		System.out.println(a + "/" + b + "=" +c);
		
		c = a % b;
		System.out.println(a + "%" + b + "=" +c);
		System.out.printf("%d %% %d = %d",a,b,c);
		System.out.println();
		 
		float d = (float)a / b;	
		System.out.println(a + "/" + b + "=" +d);
	}
}
