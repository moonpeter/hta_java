package day_1222.ex06_Buffered2_Read_Writer;

import java.io.*;

public class BufferedReaderEx01 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader("src/day_1222/ex06_Buffered2_Read_Writer/output.txt"));
            char arr[] = {'내', '꺼', ' ', '인', '듯', ' ', '내', '꺼', ' ', '아', '닌', ' ', '내', '꺼', ' ', '같', '은', ' ', '너'};
            int num = reader.read(arr);
            System.out.println(new String(arr,0,num));
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일 존재 하지 않음");
        } catch (IOException ioe) {
            System.out.println("IOE 예외 발생");
        } catch (NullPointerException n) {
            System.out.println("nullpoint excpetion 발생");
        }
        finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("파일을 닫는 중 오류입니다.");
            }
        }
    }
}
