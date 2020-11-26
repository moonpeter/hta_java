package day07_1125.ex06;

public class Ex02_Exception {
    public static void main(String args[]) {
        int sum = 1 + 2;
        try {
            if (sum < 0) {
                throw new Exception("에러 발생");
            }
            System.out.println(sum);
        } catch (Exception e) {
            String str = e.getMessage();
            System.out.println(str);
        }
    }
}
