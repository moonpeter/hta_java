package day01_05.ex07_1120;

public class ContinueExample01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			
		}	
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}