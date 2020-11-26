package day01_05.ex04_8_concate;

public class ConcatExample1 {
	public static void main(String args[]) {
		String str1 = "num=" + 3 + 4;
		System.out.println(str1);
		
		String str2 = 3 + 4 + "=num";
		System.out.println(str2); // 7 = num
		
		String str3 = "num=" + (3+4);
		System.out.println(str3); // num = 7
		
		str1 = "" + 3 + 4;
		System.out.println(str1); // 34
	}
}