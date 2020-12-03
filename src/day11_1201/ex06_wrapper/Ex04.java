package day11_1201.ex06_wrapper;

public class Ex04 {
    public static void main(String[] args) {
        int num = 0;

        for (String arg : args) {
            num += Integer.parseInt(arg);
        }

        System.out.println("합은 = " + num);
        System.out.println(num + " / 2진수 " + Integer.toBinaryString(num));
        System.out.println(num + " / 8진수 " + Integer.toOctalString(num));
        System.out.println(num + " / 16진수 " + Integer.toHexString(num));

    }
}
