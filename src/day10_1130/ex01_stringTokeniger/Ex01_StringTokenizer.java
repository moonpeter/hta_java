package day10_1130.ex01_stringTokeniger;

import java.util.StringTokenizer;

public class Ex01_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer stok = new StringTokenizer("사과,배|복숭아", ",|");

        while (stok.hasMoreTokens()) {
            String str = stok.nextToken();
            System.out.println(str);
        }
    }
}