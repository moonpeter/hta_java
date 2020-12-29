package day_1229.ex01_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx01_different_insert_1_prepared {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            String sql = "insert into test(no, name) "
                    + "values(?,?)";

            int result = 0, count = 0;

            long start = System.currentTimeMillis();
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < 10000; i++) {
                pstmt.setInt(1, i);
                pstmt.setString(2, "홍길동");
                result = pstmt.executeUpdate();
                count += result;
            }
            long end = System.currentTimeMillis();

            System.out.println("소요시간 : " + (end - start) + "ms");
            if (count == 10000)
                System.out.println("삽입 완료");

        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try{
                if (pstmt != null)
                    pstmt.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
