package day09_1127.ex07_String;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명을 입렭하세요 > ");
        String filename = sc.nextLine();

        int index = filename.lastIndexOf(".");
        if (index == -1) {
            System.out.println("파일명을 정확하게 입력하세요.");
        } else {
            String result = filename.substring(index+1);
            System.out.println(result);
        }
        sc.close();
    }
}
