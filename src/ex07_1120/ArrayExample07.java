package ex07_1120;

import java.util.Scanner;

public class ArrayExample07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		double avg = 0;
		
		for (int j = 0; j < 5; j++) {
			System.out.printf("%d번째 점수 입력 : ", j+1);
			score[j] = sc.nextInt();
			if (j == 5) 
				break;
		}
				
		for (int i = 0; i < score.length; i++) {
//			System.out.printf("score[%d]=%d\n", i, score[i]);
			sum += score[i];
		}
		avg = (double)sum / 5;
		System.out.println("총합=" + sum);
		System.out.println("평균=" + avg);
		sc.close();
	}
}