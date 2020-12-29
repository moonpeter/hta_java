package day_1229.ex03_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Ex01_oracle_transaction {
    public static void main(String[] args) {
        StringBuilder sql1 = new StringBuilder();
        sql1.append("insert into goodsinfo ");
        sql1.append("values(?,?,?,?) ");

        StringBuilder sql2 = new StringBuilder();
        sql2.append("update goodsinfo ");
        sql2.append("set price = ? ");
        sql2.append("where code = ? ");

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            conn.setAutoCommit(false);

            pstmt = conn.prepareStatement(sql1.toString());

            pstmt.setString(1, "10006");
            pstmt.setString(2, "공기청정기");
            pstmt.setInt(3, 500000);
            pstmt.setString(4, "코웨이");
            int result1 = pstmt.executeUpdate();
            pstmt.close();

            pstmt = conn.prepareStatement(sql2.toString());
            pstmt.setInt(1, 30000);
            pstmt.setString(2, "10002");
            int result2 = pstmt.executeUpdate();

            if(result1==1 && result2==1) {
                conn.commit();
                System.out.println("db에 반영됨.....");
            } else {
                conn.rollback();
                System.out.println("db 반영이 취소됨");
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if(pstmt !=null)
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
