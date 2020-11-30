package day10_1130.ex01_stringTokeniger;

import java.util.StringTokenizer;

public class Ex02_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);

        while (stok.hasMoreTokens()) {
            String str = stok.nextToken();
            System.out.println(str);
        }
    }
}