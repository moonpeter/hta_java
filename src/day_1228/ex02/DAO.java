package day_1228.ex02;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    public ArrayList<Emp> selectAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;

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
                    list = new ArrayList<Emp>();
                }
                Emp st = new Emp();
                st.setEmpno(rs.getInt(1));
                st.setEname(rs.getString(2));
                st.setJob(rs.getString(3));
                st.setMgr(rs.getInt(4));
                st.setHiredate(rs.getString(5));
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
