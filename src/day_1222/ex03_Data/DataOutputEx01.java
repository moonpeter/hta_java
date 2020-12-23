package day_1222.ex03_Data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputEx01 {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                    new FileOutputStream("src/day_1222/ex03_Data/output.dat"));

            int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int cnt=0; cnt<arr.length; cnt++) {
                out.writeInt(arr[cnt]);
            }
        } catch (IOException ioe){
            System.out.println("파일을 출력할 수 없습니다.");
        }
        finally {
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
