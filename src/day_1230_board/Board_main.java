package day_1230_board;

import java.util.List;
import java.util.Scanner;

public class Board_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardDAO_seq dao = new BoardDAO_seq();

        do {
            int menu = menuselect(sc);
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
                    selectAll(dao);
                    break;
                case 6:
                    sc.close();
                    return;
            }
        } while (true);
    }

    private static int menuselect(Scanner sc) {
        String menus[] = { "글쓰기", "수정", "답변달기", "글삭제", "조회", "종료"};
        int i = 0;
        System.out.println("======================================================");
        for (String menu : menus) {
            System.out.println(++i + "." + menu);
        }
        System.out.println("======================================================");
        System.out.println("메뉴를 선택하세요>");
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
                    System.out.print(start + "~" + end + "사이의 숫자를 입력하세요");
                }
            } catch (NumberFormatException e) {
                System.out.print("숫자로 입력하세요>");
            }
        return input;
    }
    private static int inputNumber(Scanner sc) {
        int input = 0;
        while (true)
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("숫자로 입력하세요>");
            }
        return input;
    }

    private static void printTitle() {
        System.out.printf("%s\t%s\t\t%s\t\t\t\t%s\t\t\t\t%s\t%s\t%s\t%s\n", "글번호", "글작성자", "제목", "내용", "ref", "lev", "seq", "date");
    }

    private static void insert(Scanner sc, BoardDAO_seq dao) {
        Board board = new Board();
        System.out.println("작성자>");
        board.setBOARD_NAME(sc.nextLine());

        System.out.println("비밀번호>");
        board.setBOARD_PASS(sc.nextLine());

        System.out.println("제목>");
        board.setBOARD_SUBJECT(sc.nextLine());

        System.out.println("글 내용>");
        board.setBOARD_CONTENT(sc.nextLine());

        boolean result = dao.boardInsert(board);
        if(result) {
            System.out.println("글이 작성되었습니다.");
        } else {
            System.out.println("오류가 발생되었습니다.");
        }
    }

    private static Board select(BoardDAO_seq dao, int num) {
        Board board = dao.getDetail(num);
        if (board != null) {
            printTitle();
            System.out.println(board.toString());
        } else {
            System.out.println("해당 글이 존재하지 않습니다.");
        }
        return board;   // 비밀번호 확인하기 위해 리턴
    }

    private static void update(Scanner sc, BoardDAO_seq dao) {
        System.out.println("수정할 글 번호를 입력하세요>");
        int num = inputNumber(sc);
        Board board = select(dao, num);
        if (board != null) {
            System.out.print("제목>");
            board.setBOARD_SUBJECT(sc.nextLine());
            System.out.println("글 내용>");
            board.setBOARD_CONTENT(sc.nextLine());
            System.out.println("비밀번호>");
            String pass = sc.nextLine();

            // 지금 입력한 비밀번호화 DB에 저장된 비밀번호 비교하기
            if(pass.equals(board.getBOARD_PASS())) {
                int result = dao.boardModify(board);
                if (result ==1) {
                    System.out.println("수정에 성공했습니다.");
                } else {
                    System.out.println("수정에 실패했습니다.");
                }
            } else {
                System.out.println("비밀번호가 다릅니다.");
            }
        }
    }

    private static void reply(Scanner sc, BoardDAO_seq dao) {
        System.out.print("답변을 달 글 번호를 입력하세요>");
        int num = inputNumber(sc);
        Board board = select(dao, num);
        if(board != null) {
            System.out.print("글쓴이>");
            board.setBOARD_NAME(sc.nextLine());
            System.out.print("제목>");
            board.setBOARD_SUBJECT(sc.nextLine());
            System.out.print("글 내용>");
            board.setBOARD_CONTENT(sc.nextLine());
            System.out.println("비밀번호>");
            board.setBOARD_PASS(sc.nextLine());
            int result = dao.boardReply(board);
            if(result != 0) {
                System.out.println("답변 달기 성공");
            } else {
                System.out.println("답변 달기 실패");
            }
        }
    }

    private static void delete(Scanner sc, BoardDAO_seq dao) {
        System.out.print("삭제할 글 번호를 입력하세요>");
        int num = inputNumber(sc);
        Board board = select(dao, num);
        if (board != null) {
            System.out.print("비밀번호>");
            String pass = sc.nextLine();
            if (pass.equals(board.getBOARD_PASS())) {
                int count = dao.boardDelete(board);
                System.out.println(count + "개 삭제되었습니다.");
            } else {
                System.out.println("비밀번호가 다릅니다.");
            }
        }
    }

    private static void selectAll(BoardDAO_seq dao) {
        List<Board> arrs = dao.getBoardList(1, 10);
        if(arrs != null) {
            printTitle();

            for (Board s : arrs) {
                System.out.println(s.toString());
            }
        } else {
            System.out.println("테이블에 데이터가 없습니다.");
        }
    }
}
