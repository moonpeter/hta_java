package day_1228.ex03;

import day_1228.ex02.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAO {
    public ArrayList<Map<String, Object>> selectAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Map<String, Object>> list = null;

        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            stmt = conn.createStatement();

            String sql_query ="select * from emp";
            rs = stmt.executeQuery(sql_query);

            int i=0;
            while (rs.next()){
                if(i++ ==0){
                    list = new ArrayList<Map<String, Object>>();
                }
                Map<String, Object> st = new HashMap<String, Object>();
                st.put("empno", rs.getInt(1));
                st.put("ename", rs.getString(2));
                st.put("job", rs.getString(3));
                st.put("mgr", rs.getInt(4));
                st.put("hiredate", rs.getString(5));
                st.put("sal", rs.getInt(6));
                st.put("comm", rs.getInt(7));
                st.put("deptno", rs.getInt(8));
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
