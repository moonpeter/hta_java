package ex04_8_concate;

public class CompExample02 {
	public static void main(String args[]) {
		int a = 10, b = 4;
		boolean test;
		
		test = a > b;
		System.out.println(a + ">" + b + "=" + test);
		
		test = a < b;
		System.out.println(a + "<" + b + "=" + test);
		
		System.out.println(a + b > a - b);
	}
}
