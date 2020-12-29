package day_1229.ex01_preparedStatement;

import java.sql.*;

public class JDBCEx01_different_insert_2_statement {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            int result = 0, count = 0;

            long start = System.currentTimeMillis();
            stmt = conn.createStatement();
            for (int i = 0; i < 10000; i++) {
                String sql = "insert into test(no, name) "
                        + "values(" + i + ",'홍길동')";
                result = stmt.executeUpdate(sql);
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
                if (stmt != null)
                    stmt.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
