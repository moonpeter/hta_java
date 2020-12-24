package day_1223.ex05_serialVersionUID_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputEx01 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            new ObjectOutputStream(new FileOutputStream("output4.dat"));
            Rectangle obj = new Rectangle(100, 200);
            System.out.println(obj);
            out.writeObject(obj);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                out.close();
            }
            catch (Exception e) {
            }
        }
    }
}
