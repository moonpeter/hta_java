package day10_1130.ex01_stringTokeniger;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);

        System.out.println("상품이름\t상품 수");
        while (stok.hasMoreTokens()) {
            String str = stok.nextToken();
            if (str.equals("|")) {
                System.out.println();
            } else if (str.equals("=")) {
                System.out.print("\t");
            } else if (str.equals("사과")) {
                System.out.print(str + "\t");
            } else{
                System.out.print(str);
            }
        }
    }
}
