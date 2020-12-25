package day_1224_JDBC.Connect_test;

import java.sql.*;

public class JDBC_Ex01_Oracle {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            System.out.println("데이터베이스 접속 완료");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        try {
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
