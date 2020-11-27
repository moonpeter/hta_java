package day09_1127.ex08_string_buffer;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        StringTokenizer stok = new StringTokenizer("사과 배 복숭아");

        while (stok.hasMoreElements()) {
            System.out.println(stok.nextToken());
        }
    }
}
