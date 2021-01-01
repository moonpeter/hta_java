package day_1230_board;

import day_1229.ex04_test.Student3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO_seq {

    public boolean boardInsert(Board board) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet rs = null;
        String sql = "";
        int result = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            sql = "insert into board "
                    + "(board_num, board_name, board_pass, board_subject, board_content, board_file, "
                    + " board_re_ref, board_re_lev, board_re_seq, board_readcount, board_date) "
                    + "values(board_seq.nextval, ?, ?, ?, ?, ?, board_seq.nextval, ?, ?, ?, sysdate)";

            // 새로운 글을 등록하는 부분
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, board.getBOARD_NAME());
            pstmt.setString(2, board.getBOARD_PASS());
            pstmt.setString(3, board.getBOARD_SUBJECT());
            pstmt.setString(4, board.getBOARD_CONTENT());
            pstmt.setString(5, board.getBOARD_FILE());

            // 원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0임.
            pstmt.setInt(6, 0);
            pstmt.setInt(7, 0);
            pstmt.setInt(8, 0);

            // 쿼리 실행
            result = pstmt.executeUpdate();
            if(result ==0)
                return false;
            return true;
        } catch (Exception ex) {
            System.out.println("boardInsert() 에러 : " + ex);
        }  finally {
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public List<Board> getBoardList(int page, int limit) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet rs = null;
        // page : 페이지
        // limit : 페이지 당 목록의 수
        // BOARD_RE_REF desc, BOARD_RE_SEQ asc에 의해 정렬한 것을
        // 조건절에 맞는 rnum의 범위 만큼 가져오는 쿼리문
        String board_list_sql = "select * from "
                + "(select rownum rnum, board_num, board_name, board_subject, board_content, board_file,"
                + "board_re_ref, board_re_lev, board_re_seq, board_readcount, board_date from "
                + "(select * from board order by board_re_ref desc, board_re_seq asc)) "
                + "where rnum>=? and rnum<=?";

        List<Board> list = new ArrayList<Board>();
        // 한 페이지당 10개씩 목록인 경우
        int startrow = (page - 1) * limit + 1; // 읽기 시작할 row 번호(1 11 21 31 ...
        int endrow = startrow + limit -1;      // 읽을 마지막 row 번호(10 20 30 40 ...
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            pstmt = conn.prepareStatement(board_list_sql);
            pstmt.setInt(1, startrow);
            pstmt.setInt(2, endrow);
            rs = pstmt.executeQuery();

            // DB에서 가져온 데이터를 VO객에체 담습니다.
            while (rs.next()) {
                Board board = new Board();
                board.setBOARD_NUM(rs.getInt("board_num"));
                board.setBOARD_NAME(rs.getString("board_name"));
                board.setBOARD_SUBJECT(rs.getString("board_subject"));
                board.setBOARD_CONTENT(rs.getString("board_content"));
                board.setBOARD_FILE(rs.getString("board_file"));
                board.setBOARD_RE_REF(rs.getInt("board_re_ref"));
                board.setBOARD_RE_LEV(rs.getInt("board_re_lev"));
                board.setBOARD_RE_SEQ(rs.getInt("board_re_seq"));
                board.setBOARD_READCOUNT(rs.getInt("board_readcount"));
                board.setBOARD_DATE(rs.getString("board_date"));
                list.add(board);    // 값을 담은 객체를 리스트에 저장
            }
            return list;    // 값을 담은 객체를 저장한 리스트를 호출한 곳으로 가져갑니다.
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("getBoardList() 에러 : " + ex);
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public Board getDetail(int num) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet rs = null;
        Board board = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            pstmt = conn.prepareStatement("select * from board where board_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                board = new Board();
                board.setBOARD_NUM(rs.getInt("board_num"));
                board.setBOARD_NAME(rs.getString("board_name"));
                board.setBOARD_PASS(rs.getString("board_pass"));
                board.setBOARD_SUBJECT(rs.getString("board_subject"));
                board.setBOARD_CONTENT(rs.getString("board_content"));
                board.setBOARD_FILE(rs.getString("board_file"));
                board.setBOARD_RE_REF(rs.getInt("board_re_ref"));
                board.setBOARD_RE_LEV(rs.getInt("board_re_lev"));
                board.setBOARD_RE_SEQ(rs.getInt("board_re_seq"));
                board.setBOARD_READCOUNT(rs.getInt("board_readcount"));
                board.setBOARD_DATE(rs.getString("board_date"));
            }
        } catch (Exception ex) {
            System.out.println("getBoardList() 에러 : " + ex);
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return board;
    }

    public int boardModify(Board modifyboard) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        String sql = "update board "
                + "set board_subject = ?, board_content=? "
                + "where board_num = ?";
        int result = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
            pstmt.setString(2, modifyboard.getBOARD_CONTENT());
            pstmt.setInt(3, modifyboard.getBOARD_NUM());
            result = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("getBoardList() 에러 : " + ex);
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public int boardReply(Board board) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "";
        int result =0;

        // 답변을 할 원문 글 그룹 번호입니다.
        // 답변을 달게 되면 답변 글은 이 번호와 같은 관련글 번호를 갖게 처리되면서
        // 같은 그룹에 속하게 됩니다. 글 목록에서 보여울 때 하나의 그룹으로 묶여서 출력됩니다.
        int re_ref = board.getBOARD_RE_REF();


        // 답글의 깊이를 의미
        // 원문에 대한 답글이 출력될 때 한번 들여쓰기 처리가 되고 답글에 대한 답글은 들여쓰기가 두번 처리되게 합니다.
        // 원문인 경우에는 이 값이 0이고, 원문의 답글은 1, 답글의 답글은 2가 됩니다.
        int re_lev = board.getBOARD_RE_LEV();

        // 같은 관련 글 중에서 해당 글이 출력된는 순서입니다.
        int re_seq = board.getBOARD_RE_SEQ();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            // 트랜잭션을 이용하기 위해서 setAutoCommit을 false로 설정합니다.
            conn.setAutoCommit(false);

            // BOARD_RE_REF, BOARD_RE_SEQ 값을 확인하여 원문 글에 다른 답글이 있으면
            // 다른 답글들의 BOARD_RE_SEQ값을 1씩 증가시킵니다.
            // 현재 글을 다른 답글보다 앞에 출력되게 하기 위해서 입니다.
            sql = "update board "
                    + "set board_re_seq = board_re_seq +1 "
                    + "where board_re_ref = ? "
                    + "and board_re_seq > ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, re_ref);
            pstmt.setInt(2, re_seq);
            pstmt.executeUpdate();
            pstmt.close();

            // 등록할 답변 글의 BOARD_RE_LEV, BOARD_RE_SEQ 값을 원문 글보다 1씩 증가시킵니다.
            re_seq = re_seq + 1;
            re_lev = re_lev + 1;

            sql = "insert into board"
                    + "(board_num, board_name, board_pass, board_subject, board_content, board_file, board_re_ref, board_re_lev, board_re_seq, board_readcount, board_date) "
                    + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, board.getBOARD_NAME());
            pstmt.setString(2, board.getBOARD_PASS());
            pstmt.setString(3, board.getBOARD_SUBJECT());
            pstmt.setString(4, board.getBOARD_CONTENT());
            pstmt.setString(5, ""); // 답변에는 파일을 업로드 하지 않습니다.
            pstmt.setInt(6, re_ref);
            pstmt.setInt(7, re_lev);
            pstmt.setInt(8, re_seq);
            pstmt.setInt(9, 0);     // BOARD_READCOUNT(조회수)는 0

            result = pstmt.executeUpdate();
            conn.commit();      // commit 합니다.

        }catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("getReply() 에러 : " + ex);
                try {
                    if(conn !=null)
                        conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public int boardDelete(Board board) {
        PreparedStatement pstmt = null;
        Connection conn = null;

        // 삭제의 조건(AND 조건)
        // 1. 선택한 글과 같은 BOARD_RE_REF 값을 갖는다.
        // 2. 선택한 글과 같거나 높은 BOARD_RE_LEV 값을 갖는다.
        // 3. 선택한 글과 같거나 높은 BOARD_RE_SEQ 값을 갖는다.
        //    단, BOARD_RE_SEQ 범위는 선택한 글과 BOARD_RE_REF, BOARD_RE_LEV 값이 같고
        //    선택한 글의 BOARD_RE_SEQ보다 큰 것들 중 가장 작은 값에서 1을 뺀 값을 갖는다.
        //    만약 존재하지 않으면 BOARD_RE_REF 값 중 가장 큰 BOARD_RE_SEQ값을 갖는다.
        String board_delete_sql = "delete from board "
                + " where board_re_ref = ?"
                + " and board_re_lev >= ?"
                + " and board_re_seq >= ?"
                + " and board_re_seq <= "
                + " (nvl((select min(board_re_seq)-1 from board where board_re_ref = ? and board_re_lev=? and board_re_seq>?) , "
                + " (select max(board_re_seq) from board where board_re_ref=? )))";

        int result = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            pstmt = conn.prepareStatement(board_delete_sql);
            pstmt.setInt(1, board.getBOARD_RE_REF());
            pstmt.setInt(2, board.getBOARD_RE_LEV());
            pstmt.setInt(3, board.getBOARD_RE_SEQ());
            pstmt.setInt(4, board.getBOARD_RE_REF());
            pstmt.setInt(5, board.getBOARD_RE_LEV());
            pstmt.setInt(6, board.getBOARD_RE_SEQ());
            pstmt.setInt(7, board.getBOARD_RE_REF());

            //
            result = pstmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("boardDelete() 에러 : " + ex);
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
