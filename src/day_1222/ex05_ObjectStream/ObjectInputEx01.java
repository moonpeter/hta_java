package day_1222.ex05_ObjectStream;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputEx01 {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("src/day_1222/ex05_ObjectStream/output.dat"));
            while (true) {
                GregorianCalendar calendar = (GregorianCalendar) in.readObject();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH) +1;
                int date = calendar.get(Calendar.DATE);
                System.out.println(year + "/" + month + "/" +date);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일로 출력할 수 없습니다.");
        } catch (EOFException eofe) {
            System.out.println("THE END!!!!!!!");
        } catch (IOException ioe) {
            System.out.println("파일을 읽을 수 없음");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스가 존재하지 않습니다.");
        }
        finally {
            try {
                if(in !=null)
                    in.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
