package day_1222.ex03_Data;

import java.io.*;

public class DataInputEx02_utf {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new FileInputStream("src/day_1222/ex03_Data/output.dat"));

            String data = in.readUTF();
            System.out.println(data);
        } catch (FileNotFoundException fnfe){
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException eofe){
            System.out.println("끝");
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
