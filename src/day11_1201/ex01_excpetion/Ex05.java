package day11_1201.ex01_excpetion;

public class Ex05 {
    public static void main(String[] args) {
        int result = devide(3, 0);
        System.out.println(result);
    }

    static int devide(int a, int b) {
        int result = a / b;
        return result;
    }
}
