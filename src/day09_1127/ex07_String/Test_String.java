package day09_1127.ex07_String;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 입력 (exit=e): ");
        String jumin = sc.nextLine();

        if (jumin.equals('e')) {
            System.out.println("종료합니다.");
            printCheck(jumin);
            sc.close();
        } else {
            printCheck(jumin);
        }
    }

    static boolean checkLength(String jumin) {
        if (jumin.length() == 14) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkHyphen(String jumin) {
        if (jumin.indexOf('-') == 6) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isNumber(String jumin) {
        if (jumin == null || jumin.equals("")){
            return false;
        }

        for (int i=0; i< jumin.length(); i++){
            char ch = jumin.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    static String select(String jumin) {
        String s = jumin.substring(7, 8);
        String gender = "";
        switch (s) {
            case "2":
            case "4":
                gender = "여자";
                break;
            case "3":
            case "1":
                gender = "남자";
                break;
            default:
                gender = "외국인";
        }
        System.out.println(gender + "입니다.");
        return gender;
    }

    private static void printCheck(String jumin) {
        if (!(checkLength(jumin))) {
            System.out.println("주민번호 길이는 14개 입니다.");
        } else if (!(checkHyphen(jumin))) {
            System.out.println("주민번호 형식에 맞지 않습니다.(-위치)");
        } else if (!(isNumber(jumin.substring(0, 6)))) {
            System.out.println("앞자리에 숫자를 입력하세요");
        }else if (!(isNumber(jumin.substring(7,14)))) {
            System.out.println("뒷자리에 숫자를 입력하세요");
        } else {
            select(jumin);
        }
    }
}
