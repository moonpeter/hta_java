package ex07_1120;

public class ArraySpecial_sub {
	public static void main(String[] args) {
		String name[] = { "강호동", "이승기", "유재석", "하하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };
		int[][] score = { { 85, 60, 70 }, // 1번 학생
				{ 90, 95, 80 }, // 2번 학생
				{ 75, 80, 100 }, // 2번 학생
				{ 80, 70, 95 }, // 2번 학생
				{ 100, 65, 80 } // 2번 학생
		};
		int[] subject = new int[3]; // 과목 총점을 저장
		int[] student = new int[5]; // 학생의 총점을 저장
		int[] student_avg = new int[5]; // 학생의 총점을 저장

//		System.out.println("=========학생 총합=========");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				student[i] += score[i][j];
			}
		}

//		System.out.println("=========평균=========");
		for (int i = 0; i < student.length; i++) {
			student_avg[i] = student[i] / subject.length;
		}

//		System.out.println("=========과목 총합=========");
		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score.length; j++) {
				subject[i] += score[j][i];
			}
		}

		for (int i = 0; i < sub_name.length; i++) {
			System.out.print("\t" + sub_name[i]);
		}
		System.out.print("\t" + "총점" + "\t" + "평균" + "\n");

		// 학생별 점수 프린트
		for (int t = 0; t < student.length; t++) {
			System.out.print(name[t] + "\t");
			for (int i = 0; i < score[t].length; i++) {
				System.out.print(score[t][i] + "\t");
			}
			System.out.print(student[t] + "\t" + student_avg[t] + "\t");
			System.out.println();
		}
		
		System.out.println("===========================================");
		
		System.out.print("총점 \t");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
	}
}
