package day12_1202.ex01_student2;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static int number;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student2[] hs = null;
        do {
            int menu = selectMenu(sc, hs);
            switch (menu) {
                case 1:
                    hs = input(sc, hs);
                    break;
                case 2:
                    update(sc, hs);
                    break;
                case 3:
                    hs = delete(sc, hs);
                    break;
                case 4:
                    select(sc, hs);
                    break;
                case 5:
                    Student2.sort(hs);
                    print(hs);
                    break;
                case 6:
                    close(sc);
                    return;
            }
        } while (true);
    }

    static int selectMenu(Scanner sc, Student2[] hs) {
        String[] menus = new String[]{"입력", "수정", "삭제", "조회", "출력", "종료"};
        int end = 1;
        if (hs != null && hs.length > 0) {
            end = menus.length;
        }
        printCharacter('*', 53);
        for (int i = 0; i < end; i++) {
            System.out.printf("%d.%s ", i + 1, menus[i]);
        }
        System.out.println();
        printCharacter('*', 53);
        System.out.print("메뉴를 선택하세요>");
        return inputNumber(sc, 1, end);
    }

    private static int inputNumber(Scanner sc, int start, int end) {
        int input = 0;
        while (true)
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input <= end && input >= start) {
                    break;
                } else {
                    System.out.printf("%d ~ %d 사이의 숫자를 입력하세요>", start, end);
                }
            } catch (NumberFormatException e) {
                System.out.print("숫자로 입력하세요");
            }
        return input;
    }

    private static void printCharacter(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    private static Student2[] input(Scanner sc, Student2[] hs) {
        System.out.print("입력할 인원수를 입력하세요(1~10)>");
        int inwon = inputNumber(sc, 1, 10);
        Student2[] copy = null;
        int index = 0;
        if (hs != null && hs.length>=1) {
            inwon = inwon + hs.length;//2
            index = hs.length;//1
            copy = new Student2[index];
            for (int i=0; i<hs.length; i++) {
                copy[i] = hs[i];
            }
        } else {
            copy = new Student2[inwon];//1
        }
        do{
            System.out.print("이름을 입력하세요>");
            String name = inputName(sc);
            System.out.print("국어점수를 입력하세요>");
            int kor = inputNumber(sc, 0, 100);
            System.out.print("영어점수를 입력하세요>");
            int eng = inputNumber(sc, 0, 100);
            System.out.print("수학점수를 입력하세요>");
            int math = inputNumber(sc, 0, 100);
            copy[index] = new Student2(name, kor, eng, math, ++number);
            index++;
        } while (index < inwon);//0<1
        return copy;
    }

    private static String inputName(Scanner sc) {
        String name = "";
        while (true) {
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;
            } else {
//                System.out.print("이름을 입력하세요");
            }
        }
        return name;
    }

    private static void update(Scanner sc, Student2[] hs) {
        System.out.print("수정할 번호를 입력하세요");
        int updateNo = sc.nextInt() - 1;

        System.out.print("이름을 입력하세요>");
        hs[updateNo].setName(sc.next());
        System.out.print("국어점수를 입력하세요>");
        hs[updateNo].setKor(sc.nextInt());
        System.out.print("영어점수를 입력하세요>");
        hs[updateNo].setEng(sc.nextInt());
        System.out.print("수학점수를 입력하세요>");
        hs[updateNo].setMath(sc.nextInt());
        print(hs);
    }

    private static void select(Scanner sc, Student2[] hs) {
        System.out.print("조회할 번호를 입력하세요");
        int searchNo = inputNumber(sc, 1, number);
        int index = -1;
        for (int i = 0; i < hs.length; i++) {
            if (hs[i].getNo() == searchNo) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            printCharacter('=', 53);
            System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.println(hs[index].toString());
            printCharacter('=', 53);
        } else {
            System.out.println("조회한 번호가 존재하지 않습니다.");
        }
    }

    private static Student2[] delete(Scanner sc, Student2[] hs) {
        System.out.print("삭제할 번호를 입력하세요");
        int deleteNo = sc.nextInt()-1;
        for (int i=deleteNo; i<hs.length; i++) {
            hs[deleteNo] = hs[deleteNo+1];
//            hs = new Student2[hs.length-1];
        }
        return hs;
    }

    private static void print(Student2[] hs) {
        for (int i = 0; i < hs.length; i++) {
            printCharacter('=', 53);
            System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.println(hs[i].toString());
            printCharacter('=', 53);
        }
    }

    private static void close(Scanner sc) {
        sc.close();
    }


}
