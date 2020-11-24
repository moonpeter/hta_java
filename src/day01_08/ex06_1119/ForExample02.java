package day01_08.ex06_1119;

public class ForExample02 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for ( ; cnt < 10;) {
			System.out.println(cnt);
			cnt++;
		}
		
		for (int a=1, b=5; a <= b; a++, b--) {
			System.out.print("a = " + a);
			System.out.println(", b = " + b);
		}
	}
}
