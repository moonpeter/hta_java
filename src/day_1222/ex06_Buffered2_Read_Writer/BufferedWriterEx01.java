package day_1222.ex06_Buffered2_Read_Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/day_1222/ex06_Buffered2_Read_Writer/output.txt");
            BufferedWriter bw = new BufferedWriter(fw, 5);
            char arr[] = {'내', '꺼', '1', '인', '듯', '2', '내', '꺼', '3', '아', '닌', '4', '내', '꺼', '5', '같', '은', '6', '너'};
            for (int cnt=0; cnt<arr.length; cnt++)
                bw.write(arr[cnt]);
            bw.flush();
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        }
        finally {
            try {
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
