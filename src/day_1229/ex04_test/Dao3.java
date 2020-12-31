package day_1229.ex04_test;

import day_1228.ex05.Emp;

import java.sql.*;
import java.util.ArrayList;

public class Dao3 {

    public int insert(Student3 student3) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        StringBuilder sql = new StringBuilder();
        sql.append("insert into student(no, name, kor, math, eng, tot, avg, grade) ");
        sql.append("values(student_seq.nextval, ?, ?, ?, ?, ?, ?, "
                + "(select grade from hakjum where 90 between lowccore and hiscore)"
                + ")");

        int result = 0;

        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");
            pstmt = conn.prepareStatement(sql.toString());

            // 입력 매개변수의 타입이 문자열이면 setString()을 호출
            pstmt.setString(1, student3.getName());

            pstmt.setInt(2, student3.getKor());
            pstmt.setInt(3, student3.getMath());
            pstmt.setInt(4, student3.getEng());
            pstmt.setInt(5, student3.getTot());
            pstmt.setFloat(6, student3.getAvg());

            // 쿼리 실행
            result = pstmt.executeUpdate();
            System.out.println("db에 반영됨..........");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public Student3 select(int no) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet result = null;
        StringBuilder sql = new StringBuilder();
        sql.append("select * from student where no = ?");
        Student3 st = null;
        try {
            // 1단계 JDBC 드라이버를 로드한다.
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            // 2단계 DB에 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            // PreparedStatement 객체 얻기
            pstmt = conn.prepareStatement(sql.toString());

            pstmt.setInt(1, no);

            // 쿼리 실행
            result = pstmt.executeQuery();
            if(result.next()) {
                st = new Student3();
                st.setNo(result.getInt("no"));
                st.setName(result.getString("name"));
                st.setKor(result.getInt("kor"));
                st.setMath(result.getInt("math"));
                st.setEng(result.getInt("eng"));
                st.setTot(result.getInt("tot"));
                st.setAvg(result.getFloat("avg"));
                st.setGrade(result.getString("grade"));
            }

        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return st;
    }

    public int update(Student3 student3) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        StringBuilder sql = new StringBuilder();
        sql.append("update student set name=?, kor=?, math=?, eng=?, tot=?, avg=?,"
                +" grade =(select grade from hakjum where ? between lowccore and hiscore) "
                + " where no=?");

        int result = -1;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            pstmt = conn.prepareStatement(sql.toString());

            pstmt.setString(1, student3.getName());
            pstmt.setInt(2, student3.getKor());
            pstmt.setInt(3, student3.getMath());
            pstmt.setInt(4, student3.getEng());
            pstmt.setInt(5, student3.getTot());
            pstmt.setFloat(6, student3.getAvg());
            pstmt.setFloat(7, student3.getAvg());
            pstmt.setInt(8, student3.getNo());

            // 쿼리 실행
            result = pstmt.executeUpdate();

        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public ArrayList<Student3> selectAll() {
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet result = null;
        StringBuilder sql = new StringBuilder();
        sql.append("select * from student order by no");
        ArrayList<Student3> arrst = null;
        try {
            // 1단계 JDBC 드라이버를 로드한다.
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            // 2단계 DB에 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            // PreparedStatement 객체 얻기
            pstmt = conn.prepareStatement(sql.toString());

            // 쿼리 실행
            result = pstmt.executeQuery();

            int count=0;
            while (result.next()){
                if(count++ ==0){
                    arrst = new ArrayList<Student3>();
                }
                Student3 st = new Student3();
                st.setNo(result.getInt("no"));
                st.setName(result.getString("name"));
                st.setKor(result.getInt("kor"));
                st.setMath(result.getInt("math"));
                st.setEng(result.getInt("eng"));
                st.setTot(result.getInt("tot"));
                st.setAvg(result.getInt("avg"));
                st.setGrade(result.getString("grade"));
                arrst.add(st);
            }

        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return arrst;
    }

    public int delete(int no) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        StringBuilder sql = new StringBuilder();
        sql.append("delete from student where no= ? ");
        int result = -1;
        try {
            // 1단계 JDBC 드라이버를 로드한다.
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            // 2단계 DB에 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "scott", "TIGER");

            // PreparedStatement 객체 얻기
            pstmt = conn.prepareStatement(sql.toString());

            // 쿼리 실행
            pstmt.setInt(1, no);

            result = pstmt.executeUpdate();

        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
}
}
