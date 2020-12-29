package day_1229.ex02_PreparedStatement;

import java.sql.*;

public class JDBC_Ex01_Oracle_insert_prepared {
    public static void main(String[] args) {
        if (args.length !=4) {
            System.out.println("상품코드 상품명 가격 제조사를 입력하세요");
            return;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            String sql = "insert into goodsinfo "
                    + "(code, name , price, maker) "
                    + "values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, args[0]);
            pstmt.setString(2, args[1]);
            pstmt.setInt(3, Integer.parseInt(args[2]));
            pstmt.setString(4, args[3]);
            int rowNum = pstmt.executeUpdate();

            System.out.println(rowNum + "행이 추가되었습니다.");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if(pstmt !=null)
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
