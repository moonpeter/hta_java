package day_1222.ex03_Data;

import java.io.*;

public class DataOutputEx03 {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                    new FileOutputStream("src/day_1222/ex03_Data/output.dat"));

            out.writeUTF("즐거운 화요일입니다.\n");
            out.writeInt(5);
            out.writeDouble(3.14);

        } catch (IOException ioe) {
            System.out.println("IO Exception");
        } finally {
            try {
                if(out != null)
                    out.close();
                System.out.println("output.dat 파일을 출력합니다.");
            }catch (Exception e) {
                System.out.println("닫는 중 오류가 발생했습니다.");
            }
        }
    }
}
