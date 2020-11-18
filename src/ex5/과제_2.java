package ex5;

import java.util.Scanner;

public class 과제_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("limit를 입력하세요 ? ");
		int limit = sc.nextInt();
		System.out.print("limit_count를 입력하세요 ? ");
		int limit_count = sc.nextInt();
		
		int share, rest, max_page;
		
		share = (limit_count / limit);
		rest = (limit_count % limit);
						
		if (rest == 0) {
			max_page = share;
		} else {
			max_page = share + 1;
		}
		
		System.out.println("max page : " + max_page);
		
	}
}
