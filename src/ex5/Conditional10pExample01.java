package ex5;

public class Conditional10pExample01 {
	public static void main(String args[]) {
		int a = 20, b = 30, max, min;
		
		System.out.println(a > b ? a : b);
		max = a > b ? a : b;
		System.out.println("최대값 : " + max);
		
		System.out.println(a < b ? a : b);		
		min = a < b ? a : b;
		System.out.println("최소값 : " + min);
	}
}
