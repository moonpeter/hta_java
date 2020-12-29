package day_1228.ex05;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    public ArrayList<Emp> search(String[] searchs) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from emp";
        String field[] = { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};

        for (int i=0; i<searchs.length; i++) {
            if(searchs[i] != null) {
                String single = "";
                if (i == 1 || i ==2 || i == 4) {
                    single ="'";
                }
                if (sql.contains("where"))
                    sql += " and ";
                else
                    sql += " where ";

                sql += field[i] + "=" +  single + searchs[i] + single;
            }
        }

        System.out.println(sql.toString());

        ArrayList<Emp> list = null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            int i=0;
            while (rs.next()){
                if(i++ ==0){
                    list = new ArrayList<>();
                }
                Emp st = new Emp();
                st.setEmpno(rs.getInt(1));
                st.setEname(rs.getString(2));
                st.setJob(rs.getString(3));
                st.setMgr(rs.getInt(4));
                st.setHiredate(rs.getDate(5));
                st.setSal(rs.getInt(6));
                st.setComm(rs.getInt(7));
                st.setDeptno(rs.getInt(8));
                list.add(st);
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
        return list;
    }
}
