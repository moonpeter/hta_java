package day01_05.ex07_1120;

public class ArrayExample01 {
	public static void main(String args[]) {
		int arr[];
		arr = new int[11];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
