package day01_08.ex03;

public class Variable2 {

	public static void main(String[] args) {
		// 참조형-s1,s2는 메모리 주소, new는 연산자,
		// new String("자바"); 에서 String()은 생성자
		String s1 = "자바";
		String s2 = new String("자바");	// String은 라이브러리로 제공되는 클래스
		System.out.println("s1=" + s1 + " s2=" + s2);
	}
}

// 클래스의 구성요서 3가지 : 생성자, 필드, 메서