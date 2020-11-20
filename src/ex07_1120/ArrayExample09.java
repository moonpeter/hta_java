package ex07_1120;

public class ArrayExample09 {
	public static void main(String[] args) {
		int data[] = {20, 30, 40, 80, 10};
		int max = data[0];
		int min = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
			if (min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
