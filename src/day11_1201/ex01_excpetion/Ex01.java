package day11_1201.ex01_excpetion;

public class Ex01 {
    public static void main(String[] args) {
        int sum = 1+ -2;
        if (sum < 0 ){
            try {
                throw new Exception("에러 발생!!!");
            } catch (Exception e) {
                String str = e.getMessage();
                System.out.println(str);
            }
        }
        System.out.println(sum);
    }
}
