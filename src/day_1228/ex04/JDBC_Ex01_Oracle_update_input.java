package day_1228.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex01_Oracle_update_input {
    public static void main(String[] args) {
        if (args.length !=2) {
            System.out.println("상품코드를 입력하세요>");
            return;
        }
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            stmt = conn.createStatement();

            String sql = "update goodsinfo set maker='" + args[1] +"' where code='" + args[0] + "'";
            System.out.println(sql + "\n");
            int rowNum = stmt.executeUpdate(sql);
            System.out.println(rowNum + "행이 수정되었습니다.");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if(stmt !=null)
                    stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
