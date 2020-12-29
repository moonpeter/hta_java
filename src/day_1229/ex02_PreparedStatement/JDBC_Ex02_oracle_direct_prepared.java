package day_1229.ex02_PreparedStatement;

import java.sql.*;

public class JDBC_Ex02_oracle_direct_prepared {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            String select_sql = "select * from dept";

            pstmt = conn.prepareStatement(select_sql.toString());
            rs = pstmt.executeQuery();

            System.out.println("번호\t\t부서번호\t부서명\t\t\t지역");
            System.out.println("---------------------------------------");

            int i = 0;
            while (rs.next()) {
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);

//                System.out.print(i++ + "\t" + empno + "\t" + ename + "\t" +  job + "\t" +  mgr + "\t" +  hiredate + "\t" +  sal + "\t" +  comm + "\t" +deptno + "\n");
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
                if (pstmt != null)
                    pstmt.close();
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
