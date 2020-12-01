package day11_1201.ex01_excpetion;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누지 마세요!!!");
        }
    }
}
