package day_1222.ex03_Data;

import java.io.*;

public class DatainputEx03 {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new FileInputStream("src/day_1222/ex03_Data/output.dat"));

            System.out.println(in.readUTF());
            System.out.println(in.readInt());
            System.out.println(in.readDouble());

        } catch (IOException ioe) {
            System.out.println("IO Exception");
        } finally {
            try {
                if(in != null)
                    in.close();
                System.out.println("output.dat 파일을 출력합니다.");
            }catch (Exception e) {
                System.out.println("닫는 중 오류가 발생했습니다.");
            }
        }
    }
}
