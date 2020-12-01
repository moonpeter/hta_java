package day11_1201.ex01_excpetion;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        } finally {
            System.out.println("여기까지 왔어요~");
        }
    }
}
