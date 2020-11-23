package ex08_1123;

public class Example12_selectionSort {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		int[] tmp = new int[5];
		
		for (int i = 0; i < a.length -1; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[0] < a[i]) {
					tmp[i] = a[0];
					a[0] = a[i];
					a[i] = tmp[i];
				}
				System.out.print(a[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
