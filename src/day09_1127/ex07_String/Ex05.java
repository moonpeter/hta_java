package day09_1127.ex07_String;

public class Ex05 {
    public static void main(String[] args) {
        String jumin = "123456-1123456";
        String s = (jumin.substring(7, 8));
        String gender = "";

        if ((s.equals("2")) || (s.equals("4"))) {
            gender = "여자";
        } else if ((s.equals("1")) || s.equals("3")) {
            gender = "남자";
        } else {
            gender = "외국인";
        }

        System.out.printf("추출한 숫자는 %s이고 %s입니다.", jumin.substring(7, 8), gender);
    }
}
