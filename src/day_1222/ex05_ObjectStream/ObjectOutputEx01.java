package day_1222.ex05_ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx01 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("src/day_1222/ex05_ObjectStream/output.dat"));
            out.writeObject(new GregorianCalendar(2018, 9,5));
            out.writeObject(new GregorianCalendar(2018, 9,6));
            out.writeObject(new GregorianCalendar(2018, 9,7));
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        }finally {
            try {
                if(out !=null) out.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
