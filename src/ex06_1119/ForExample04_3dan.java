package ex06_1119;

public class ForExample04_3dan {
	public static void main(String[] args) {
		int dan, f, s, result = 0;

		for (dan = 2; dan < 10; dan++) {
			System.out.print("[" + dan + "단]" + "\t\t");
		}

		System.out.println();
		for (f = 1; f < 10; f++) {
			for (s = 2; s < 10; s++) {
				result = f * s;
				System.out.printf("%d * %d = %d\t", s, f, result);
				if (s % 9 == 0) {
					System.out.println();	
		
				}
			}
		}
	}
}

   	    