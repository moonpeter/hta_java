package day01_05.ex07_1120;

public class ArrayExample13 {
	public static void main(String[] args) {
		int table[][] = new int[3][4];
		
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);

		
		System.out.println("tabel[0][0] = " + table[0][0]);
		System.out.println("tabel[0][1] = " + table[0][1]);
		System.out.println("tabel[0][2] = " + table[0][3]);
		System.out.println("tabel[0][2] = " + table[0][3]);

		
		for (int i = 0; i < table.length; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.printf("tabel[" + i + "][" + j + "]=" + table[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("===================");
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("tabel[" + i + "][" + j + "]=" + table[i][j] + "\n");
			}
		}
	
	}
}