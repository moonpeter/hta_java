package day10_1130.ex01_stringTokeniger;

import java.util.StringTokenizer;

public class Ex04_StringTokenizer {
    public static void main(String[] args) {
        String phone = "010-1234-5678";
        StringTokenizer stok = new StringTokenizer(phone, "-");

        while (stok.hasMoreTokens()) {
            String str = stok.nextToken();
            System.out.println(str);
        }

        String[] str2 = phone.split("-");
        for (String s : str2) {
            System.out.println(s);
        }
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
    }
}
