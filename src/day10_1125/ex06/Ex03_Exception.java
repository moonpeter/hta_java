package day10_1125.ex06;

public class Ex03_Exception {
    public static void main(String args[]) {
        try {
            int result = add(1, -2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("애러가 발생했습니다;");
        }
    }

    static int add(int a, int b) throws Exception {
        int result = a +b;
        if (result < 0) {
            throw new Exception("애러발생");
        }
        return result;
    }
}
