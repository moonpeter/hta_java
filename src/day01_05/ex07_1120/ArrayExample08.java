package day01_05.ex07_1120;

import java.util.Scanner;

public class ArrayExample08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목 수를 입력하세요>");
		int count = sc.nextInt();
		
		int score[] = new int[count];
		int sum = 0;
		double avg = 0;
		
		for (int j = 0; j < count; j++) {
			System.out.printf("%d번째 점수 입력 : ", j+1);
			score[j] = sc.nextInt();
			if (j == count) 
				break;
		}
				
		for (int i = 0; i < score.length; i++) {
//			System.out.printf("score[%d]=%d\n", i, score[i]);
			sum += score[i];
		}
		avg = (double)sum / count;
		System.out.println("총합=" + sum);
		System.out.println("평균=" + avg);
		
		sc.close();
	}
}