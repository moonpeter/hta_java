package day11_1201.ex02_object;

import java.io.File;

public class Ex01 {
    public static void main(String[] args) {
        File file = new File("C:\\뻐구기");
        String str = file.toString();
        System.out.println(str);
    }
}
