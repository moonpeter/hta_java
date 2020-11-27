package day09_1127.ex07_String;

public class Ex09 {
    public static void main(String[] args) {
        String message = "Java program creates many objects.";
        String message2 = "Java programaaaaaa  many objects.";

        int index1 = message.lastIndexOf('a');
        System.out.println("a의 위치는 " + index1);

        int index2 = message.lastIndexOf(97);
        System.out.println("a의 위치는 " + index2);

        int index23 = message.lastIndexOf(65);
        System.out.println("A의 위치는 " + index23);

        int index3 = message.lastIndexOf('a', 13);
        System.out.println("13번 부터 a의 위치는 " + index3);

        int index33 = message2.lastIndexOf('a',13);
        System.out.println("13번 부터 a의 위치는 " + index33);

        int index4 = message.lastIndexOf("av");
        System.out.println("av로 시작하는 index는 " + index4);

        int index5 = message.lastIndexOf("man", 12);
        System.out.println("12번째 부터 man위치는 " + index5);

        int index6 = message.lastIndexOf("java");
        System.out.println("java의 위치는 " + index6);
    }
}
