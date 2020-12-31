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
                + "where rnum>? and rnum<=?";

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
                board.setBOARD_PASS(rs.getString("board+pass"));
                board.setBOARD_SUBJECT(rs.getString("board_subject"));
                board.setBOARD_CONTENT(rs.getString("board_content"));
                board.setBOARD_FILE(rs.getString("board_file"));
                board.setBOARD_RE_REF(rs.getInt("board_re_ref"));
                board.setBOARD_RE_LEV(rs.getInt("board_re_lev"));
                board.setBOARD_RE_SEQ(rs.getInt("board_re_seql"));
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
}
