package day01_05.ex07_1120;

public class BreakExample {
	public static void main(String[] args) {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			if(cnt == 5)
				break;
		}
		System.out.println("End!!!");
	}
}
