package day09_1127.ex08_string_buffer;

public class Ex02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("동해물과 백두산이 마르고  ");
        // 기존 문자열에 추가함
        System.out.println(sb.append("닳도록 보우하사 "));

        System.out.println(sb.insert(19, "하느님이 하느님이 "));

        System.out.println(sb.delete(24, 28));

        System.out.println(sb.deleteCharAt(9));

        System.out.println(sb.append("닳도록 보우하사 ").delete(0, 5));
    }
}
