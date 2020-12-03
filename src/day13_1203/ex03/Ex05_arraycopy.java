package day13_1203.ex03;

public class Ex05_arraycopy {
    public static void main(String[] args) {
        char arr1[] = {'가', '나', '다', '라', '마', '바', '사', '아', '자', '차', '카', '타', '파', '하'};
        char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};

        System.arraycopy(arr1, 10, arr2, 2, 3);

        for (char ch : arr2) {
            System.out.print(ch + " ");
        }

        System.out.println();

        char copy[] = new char[arr1.length];
        System.arraycopy(arr1, 0, copy, 0, arr1.length);
        for (char ch : copy) {
            System.out.print(ch + " ");
        }
    }
}
