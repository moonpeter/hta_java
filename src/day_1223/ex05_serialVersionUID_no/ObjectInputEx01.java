package day_1223.ex05_serialVersionUID_no;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputEx01 {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("output4.dat"));
            Rectangle obj = (Rectangle) in.readObject();

            System.out.println(obj);
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일 존재 안함");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스 존재 안함");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
