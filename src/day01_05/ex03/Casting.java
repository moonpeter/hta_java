package day01_05.ex03;

public class Casting {

	public static void main(String[] args) {
		// 정수형 변수 i1에 10을 대입합니다.
		int i1 = 10;
		
		// 자동 형변환은 변수에 값을 저장하거나 메서드의 인자값이 매개변수로 전달될 때
		// 일치하지 않는 자료형인 경우 컴파일러가 자동으로 형변환을 해주는 것입니다.
		// double d1 = (double)i1;
		double d1 = i1;	// 실수형 변수에 정수형 값을 저장할 수 있습니다.
		System.out.println("d1 데이터는 " + d1 + "입니다.");
		
		double d2 = 10.12345;
		// 에러 발생
		// int i2 = d2;	// 정수형 변수에 실수형 값을 저장할 수 없습니다.
		
		// 명시적 형변환
		int i2 = (int) d2;
		System.out.println("i2데이터는 " + i2 + "입니다.");
	}

}
