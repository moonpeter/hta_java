package day01_05.ex06_1119;

public class SwitchExample02 {

	public static void main(String[] args) {
		char ch = 'v';
		
		switch (ch) {
		case 'A' :
		case 'a' :
			System.out.println("사과");
			break;
			
		case 'P' :
		case 'p' :
			System.out.println("배");
			break;

		case 'G' :
		case 'g' :
			System.out.println("포도");
			break;
		
		default :
			System.out.println("해당사항 없음");
		}
		System.out.println("End!!!");
	}

}
