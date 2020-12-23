package day_1222.ex03_Data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputEx02 {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                    new FileOutputStream("src/day_1222/ex03_Data/output.dat"));
            out.writeUTF("즐거운 화요일 입니다.");
        }
        catch (IOException ioe) {
            System.out.println("파일로 출력 불가");
        }
        finally {
            try {
                out.close();
                System.out.println("완료");
            }catch (IOException ioe){
                System.out.println("IOE 발");
            }
        }
    }
}
