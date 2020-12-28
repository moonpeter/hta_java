package day_1228.ex01;

import java.sql.*;

public class JDBC_Ex02_oracle_name_goodsinfo_3 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            stmt = conn.createStatement();

            String select_sql = "select code, name, price, maker " +
                    "from goodsinfo " +
                    "where name ='디지털 TV'";

            rs = stmt.executeQuery(select_sql);

            ResultSetMetaData mt = rs.getMetaData();
//            System.out.printf("번호%10s %10s %20s %10s\n",
//                    mt.getColumnName(1), mt.getColumnName(2),
//                    mt.getColumnName(3), mt.getColumnName(4));
            System.out.println("번호  상품코드 \t 상품명\t\t\t가격     제조사");
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
