package ex08_1123;

public class Example02 {
	public static void main(String args[]) {
		printCharacter('*', 30);
	}
	
	public static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
		return;
	}
	
}
