package a_self.Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    public boolean boardInsert(Board board) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        String sql;
        int result;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            sql = "insert into board (num, name, pass, subject, content, file, ref, lev, seq, readcount, b_date) "
                    + "values(board_seq.nextval, ?, ?, ?, ?, ?, board_seq.nextval, ?, ? ?, sysdate)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, board.getName());
            pstmt.setString(2, board.getPass());
            pstmt.setString(3, board.getSubject());
            pstmt.setString(4, board.getContent());
            pstmt.setString(5, board.getFile());

            pstmt.setInt(6, 0);
            pstmt.setInt(7, 0);
            pstmt.setInt(8, 0);

            result = pstmt.executeUpdate();
            if (result == 0 ) {
                return false;
            } return true;
        } catch (Exception ex) {
            System.out.println("boardInsert() 에러 : " + ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }
}
