package day01_08.ex05_1118;

public class LogicalExample06 {

	public static void main(String[] args) {
		int a = 20, b = 20;
		
		if(a>=20 && ++b>=20) { 
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		
		System.out.println(b);
		System.out.println("===================");
		
		a=10; b=20;
		if(a>=20 && ++b>=20) { 
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		System.out.println(b);
	}

}
