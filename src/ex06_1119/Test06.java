package ex06_1119;

public class Test06 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		for(int i = 2; i < 11; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		int result =0;
		for(int i = 0; i < 11; i++) {
			result += i;
		}
		System.out.println("sum : " + result);
		
		result = 0;
		for(int i = 1; i < 11; i+=2) {
			result += i;
		}
		System.out.println("sum(홀수) : " + result);
		
		result = 0;
		for(int i = 2; i < 11; i+=2) {
			result += i;
		}
		System.out.println("sum(짝수) : " + result);
	}
}
