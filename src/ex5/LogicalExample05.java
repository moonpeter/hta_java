package ex5;

public class LogicalExample05 {
	public static void main(String args[]) {
		System.out.println(!true);
		System.out.println(!false);
		
		int a=3, b=4;
		
		if(a >= b) {
			System.out.println(a + ">=" + b);
		}
		
		if(!(a>=b)) {
			System.out.println(a + "<" + b);
		}
	}
}
