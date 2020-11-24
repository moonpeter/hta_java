package day01_08.ex07_1120;

import java.util.Scanner;

public class ArrayExample12 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "전우치", "홍길동", "세종대왕", "김길동", "홍길동" };		
		Scanner sc = new Scanner(System.in);
		
		int index = -1;
		
		System.out.println("검색할 이름을 입력하세요>");
		System.out.print("이름 : ");
		String inputname = sc.next();
		
		for (int i = names.length-1; i >= 0; --i) {
			if (inputname.equals(names[i])) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.printf("%s는 배열의 index=%d에서 찾음", inputname, index);
		} else {
			System.out.printf("%s는 배열에서 못 찾음", inputname);
		}
		sc.close();
	}
}
