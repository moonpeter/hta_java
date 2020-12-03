package day13_1203.ex01_student2;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static int number;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student2> hs = new ArrayList<Student2>();
        do {
            int menu = selectMenu(sc, hs);
            switch (menu) {
                case 1:
                    input(sc, hs);
                    break;
                case 2:
                    update(sc, hs);
                    break;
                case 3:
                    delete(sc, hs);
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

    static int selectMenu(Scanner sc, ArrayList<Student2> hs) {
        String[] menus = new String[]{"입력", "수정", "삭제", "조회", "출력", "종료"};
        int end = 1;
        if (hs != null && hs.size() > 0) {
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

    private static void input(Scanner sc, ArrayList<Student2> hs) {
        System.out.print("입력할 인원수를 입력하세요(1~10)>");
        int inwon = inputNumber(sc, 1, 10);

        for (int i = 0; i < inwon; i++) {
            System.out.print("이름을 입력하세요>");
            String name = inputName(sc);
            System.out.print("국어점수를 입력하세요>");
            int kor = inputNumber(sc, 0, 100);
            System.out.print("영어점수를 입력하세요>");
            int eng = inputNumber(sc, 0, 100);
            System.out.print("수학점수를 입력하세요>");
            int math = inputNumber(sc, 0, 100);

            hs.add(new Student2(name, kor, eng, math, ++number));
        }
    }

    private static String inputName(Scanner sc) {
        String name = "";
        while (true) {
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;
            }
        }
        return name;
    }

    private static void update(Scanner sc, ArrayList<Student2> hs) {
        System.out.print("수정할 번호를 입력하세요");
        int index = getIndex(sc, hs);
        if(index == -1) {
            System.out.println("수정할 번호가 존재하지 않습니다.");
        }

        System.out.print("이름을 입력하세요>");
        String name = sc.next();
        System.out.print("국어점수를 입력하세요>");
        int kor = sc.nextInt();
        System.out.print("영어점수를 입력하세요>");
        int eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요>");
        int math = sc.nextInt();
        hs.set(index, new Student2(name, kor, eng, math, number));
        print(hs);
    }

    private static void select(Scanner sc, ArrayList<Student2> hs) {
        System.out.print("조회할 번호를 입력하세요");
        int index = getIndex(sc, hs);

        if (index != -1) {
            printCharacter('=', 53);
            System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.println(hs.get(index));
            printCharacter('=', 53);
        } else {
            System.out.println("조회한 번호가 존재하지 않습니다.");
        }
    }

    private static void delete(Scanner sc, ArrayList<Student2> hs) {
        System.out.print("삭제할 번호를 입력하세요");
        int index = getIndex(sc, hs);
        if (index != -1) {
            Student2.korTotal -= hs.get(index).getKor();
            Student2.engTotal -= hs.get(index).getEng();
            Student2.mathTotal -= hs.get(index).getMath();
            hs.remove(index);
        } else {
            System.out.println("삭제할 번호가 존재하지 않습니다.");
        }

    }

    private static void print(ArrayList<Student2> hs) {
        for (int i = 0; i < hs.size(); i++) {
            printCharacter('=', 53);
            System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.println(hs.get(i));
            printCharacter('=', 53);
        }
    }

    private static void close(Scanner sc) {
        sc.close();
    }

    private static int getIndex(Scanner sc, ArrayList<Student2> hs) {
        int searchNo = inputNumber(sc, 1, number);
        for (int i = 0; i < hs.size(); i++) {
            if (searchNo == hs.get(i).getNo()) ;
            return i;
        }
        return -1;
    }
    private static int getUpdateItem(Scanner sc) {
        String[] items = {"입력", "수정", "삭제", "조회", "출력", "종료"};
        int count =1;
        for(String item : items) {
            System.out.println(count++ + "."+item);
        }
        System.out.println("수정할 항목을 선택하세요>");
        return inputNumber(sc, 1, items.length);
    }
}
