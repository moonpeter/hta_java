package day01_08.ex08_1123;

public class Example03 {
	public static void main(String args[]) {		
		for (int i = 10; i < 10000; i *= 10) {
			System.out.println("합(1~" + i + ") : " + sum(i));
			Example02.printCharacter('-', 30);
		}
		
	}
	
	public static int sum(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
//		System.out.printf("합(1~" + end + ") : " + sum);
		return sum;
	}
}
