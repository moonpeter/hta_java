package day01_05.ex07_1120;

public class ArrayExample05 {
	public static void main(String[] args) {
		int score[] = { 95, 70, 80, 75, 100 };
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("score[%d]=%d\n", i, score[i]);
			sum += score[i];
		}
		
		System.out.printf("총합=%d", sum);
	}
}