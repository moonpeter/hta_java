package day09_1127.ex07_String;

public class Ex04 {
    public static void main(String[] args) {
        String str = "나를 사랑하는 자바";

        for (int cnt = 0; cnt < str.length(); cnt++) {
            char ch = str.charAt(cnt);
            System.out.println("index = " +cnt + " 문자 = " + ch);
        }

        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
