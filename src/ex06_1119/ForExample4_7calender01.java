package ex06_1119;

public class ForExample4_7calender01 {
	public static void main(String[] args) {
		for (int i = 1; i<32; i++) {
			System.out.print(i + "\t");
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
