package a_self.Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
    public boolean boardInsert(Board board) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        String sql;
        int result;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc.oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            sql = "insert into board(num, name, pass, subject, content, file, ref, lev, seq, readcount, b_date) "
                    + "values(board_seq.nextval, ?, ?, ?, ?, ?, board_seq.nextval, ?, ? ?, sysdate)";

            pstmt = conn.prepareStatement(sql);
        }
    }
}
