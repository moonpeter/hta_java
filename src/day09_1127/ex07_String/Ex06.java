package day09_1127.ex07_String;

public class Ex06 {
    public static void main(String[] args) {
        String jumin = "123456-5123456";
        String s = (jumin.substring(7, 8));
        String gender = "";

        switch (s) {
            case "2" :
            case "4" : gender = "여자";
            break;

            case "3" :
            case "1" : gender = "남자";
            break;

            default:
                gender = "외국인";
        }

        System.out.printf("추출한 숫자는 %s이고 %s입니다.", s, gender);
    }
}
