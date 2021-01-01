package a_self.Board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DAO dao = new DAO();

        do{
            int menu = meneslect(sc);
            switch (menu) {
                case 1:
                    insert(sc, dao);
                    break;
                case 2:
                    update(sc, dao);
                    break;
                case 3:
                    reply(sc, dao);
                    break;
                case 4:
                    delete(sc, dao);
                    break;
                case 5:
                    selectAll(sc, dao);
                    break;
                case 6:
                    sc.close();
                    return;
            }
        } while (true);
    }

    private static int meneslect(Scanner sc) {
        String menus[] = { "글쓰기", "수정", "답변달기", "글삭제", "조회", "종료"};
        int i = 0;
        System.out.println("======================================================");
        for (String menu : menus) {
            System.out.println(++i + "." + menu);
        }
        System.out.println("======================================================");
        System.out.print("메뉴를 선택하세요>");
        return inputNumber(sc, 1, menus.length);
    }

    private static int inputNumber(Scanner sc, int start, int end) {
        int input = 0;
        while (true)
            try {
                input = Integer.parseInt(sc.nextLine());
                if ((input <= end && input >= start) || (start == 0 && end == 0)) {
                    break;
                } else {
                    System.out.println(start + "~" + end + "사이의 숫자를 입력하세요");
                }
            } catch (NumberFormatException e) {
                System.out.print("숫자로 입력하세요>");
            }
        return input;   // sc.nextLine으로 입력받은 값(메뉴에 해당하는 숫자)
    }

    private static void insert(Scanner sc, DAO dao) {
        Board board = new Board();

        System.out.print("작성자>");
        board.setName(sc.nextLine());
        System.out.print("비밀번호>");
        board.setPass(sc.nextLine());
        System.out.print("제목");
        board.setSubject(sc.nextLine());
        System.out.print("내용>");
        board.setContent(sc.nextLine());

        boolean result = dao.boardInsert(board);
        if(result) {
            System.out.println("글이 작성되었습니다.");
        } else {
            System.out.println("글 작성 중 오류가 발생했습니다.");
        }
    }

    private static void update(Scanner sc, DAO dao) {
    }

    private static void reply(Scanner sc, DAO dao) {
    }

    private static void delete(Scanner sc, DAO dao) {
    }

    private static void selectAll(Scanner sc, DAO dao) {
    }
}
