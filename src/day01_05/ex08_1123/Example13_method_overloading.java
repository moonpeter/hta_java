package day01_05.ex08_1123;

public class Example13_method_overloading {
	public static void main(String[] args) {
		System.out.println("max(10, 20) = " + max(10, 20));
		System.out.println("max(10, 20, 30) = " + max(10, 20, 30));
		System.out.println("max(10, 20, 30, 40) = " + max(10, 20, 30, 40));
	}

	public static int max(int num1, int num2) {
		int max = 0;
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		return max;
	}

	public static int max(int num1, int num2, int num3) {
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		return max;
	}
	
	public static int max(int num1, int num2, int num3, int num4) {
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3 && num2 > num4) {
				max = num2;
			} else if (num3 > num4){
				max = num3;
			} else {
				max = num4;
			}
		}
		return max;
	}
}
