package day_1229.ex02_PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Ex03_oracle_create_prepared {
    public static void main(String[] args){
        if (args.length !=1) {
            System.out.println("상품명을 입력하세요>");
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            String sel_where_sql = "select code, name, price, maker "
                    + "from goodsinfo "
                    + "where name = ?";
            pstmt = conn.prepareStatement(sel_where_sql.toString());
            pstmt.setString(1, args[0]);
            rs = pstmt.executeQuery();

            System.out.println("\n번호  상품코드 \t 상품명\t\t\t가격     제조사");
            System.out.println("--------------------------------");

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
