package day09_1127.ex07_String;

public class Ex01 {
    public static void main(String[] args) {
        String str = "집에 가고 싶어요";
        int len = str.length();

        for (int cnt = 0; cnt < len; cnt++) {
            char ch = str.charAt(cnt);
            System.out.println("index = " + cnt + "문자 = " + ch);
        }
    }
}
