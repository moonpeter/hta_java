package day01_08.ex08_1123;

public class Example14_method_overloading {
	
	public static int max(int n1, int n2) {
		return n1>n2?n1:n2;
	}
	
	public static int max(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		return max;
	}
	
	public static int max(int n1, int n2, int n3, int n4) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		if(max < n4) max = n4;
		return max;
	}
}
