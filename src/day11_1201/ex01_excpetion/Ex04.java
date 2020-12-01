package day11_1201.ex01_excpetion;

public class Ex04 {
    public static void main(String[] args) {
        try {
            int result = add(1, -2);
            System.out.println(result);
        } catch (Exception e) {
            String mss =  e.getMessage();
            System.out.println(mss);
        }
    }

    static int add(int a, int b) throws Exception{
        int result = a + b;
        if (result < 0 ) {
            throw new Exception("에러 발생");
        }
        return result;
    }
}
