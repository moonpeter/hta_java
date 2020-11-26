package day01_05.ex06_1119;

public class Test04 {
	public static void main(String[] args) {

		// 1번
		System.out.println("1번 문제 : 홀수 출력");
		int num = 1;
		while (num < 11) {
			System.out.print(num + " ");
			num += 2;
		}

		System.out.println("");

		// 2번
		System.out.println("2번 문제 : 짝수 출력");
		num = 2;
		while (num < 11) {
			System.out.print(num + " ");
			num += 2;
		}

		System.out.println("");

		// 3번
		System.out.println("3번 문제 : 총합");
		int sum = 0;
		num = 1;
		while (num < 11) {
			sum = sum + num;
			num += 1;
		}
		System.out.println(sum);
	
		// 4번
		System.out.println("4번 문제 : 홀수의 합");
		sum = 0;
		num = 1;
		while (num < 11) {
			sum = sum + num;
			num += 2;
		}
		System.out.println(sum);

		// 5번
		System.out.println("5번 문제 : 짝수의 합");
		sum = 0;
		num = 0;
		while (num < 11) {
			sum = sum + num;
			num += 2;
		}
		System.out.println(sum);

		
	}
}
