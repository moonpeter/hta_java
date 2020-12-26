package day_1224_JDBC.select;

import java.sql.*;

public class JDBC_Ex03 {
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

            String select_sql = "select * from emp";

            rs = stmt.executeQuery(select_sql);

            System.out.println("번호\t사원번호\t사원이름\t직급\t상사\t입사일\t급여\t커미션\t부서번호");
            System.out.println("--------------------------------");

            int i = 0;
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");

//                System.out.print(i++ + "\t" + empno + "\t" + ename + "\t" +  job + "\t" +  mgr + "\t" +  hiredate + "\t" +  sal + "\t" +  comm + "\t" +deptno + "\n");
                System.out.printf("%5d\t%5d\t%-8s%-10s\t%-5d\t%-15s%7d%7d%5d\n", ++i, empno, ename, job, mgr, hiredate, sal, comm, deptno);
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
