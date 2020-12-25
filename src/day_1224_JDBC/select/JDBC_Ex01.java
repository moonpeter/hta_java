package day_1224_JDBC.select;

import java.sql.*;

public class JDBC_Ex01 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // JDBC 드라이버를 로드
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            // DB에 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            stmt = conn.createStatement();

            String select_sql = "select * from dept";

            rs = stmt.executeQuery(select_sql);

            System.out.println("번호\t\t부서번호\t\t부서명\t\t지역");
            System.out.println("--------------------------------");

            int i = 0;
            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                System.out.printf("%5d\t%5d\t%-15s%s\n", ++i, deptno, dname, loc);
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        }
}
