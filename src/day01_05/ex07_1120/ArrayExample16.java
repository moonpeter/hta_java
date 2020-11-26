package day01_05.ex07_1120;

public class ArrayExample16 {
	public static void main(String[] args) {
		int arr[][] = {{10, 20}, {30, 40}, {50}};

//		for (int i = 0; i < arr.length; i++) {
//			for (int num : arr[i]) {
//				System.out.print(num + " ");
//			}
//		}
		
		for (int num[] : arr) {
			for (int num_2 : num) {
				System.out.print(num_2 + " ");
			}
			System.out.println();
		}
		
		System.out.println("End!!!!!!!!!!");
	}
}
