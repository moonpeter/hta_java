package day_1223.ex04_serialization_transient_no;

import java.io.*;

public class ObjectInputEx01 {
    public static void main(String[] args){
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("output3.dat"));
            while (true) {
                BBSItem obj = (BBSItem) in.readObject();
                System.out.println(obj);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일 존재 안함");
        } catch (EOFException eofe) {
            System.out.println("끝");
        } catch (IOException ioe) {
            System.out.println("IOE Exception");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 없음");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
