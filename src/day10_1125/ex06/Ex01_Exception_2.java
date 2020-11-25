package day10_1125.ex06;

public class Ex01_Exception_2 {
    public static void main(String args[]) {
        int num1 = 3, num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (java.lang.ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
