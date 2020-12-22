package day_1222.ex01_FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/day_1222/ex01_FileReader/output.txt", true);
            char arr[] = {'너', '를', ' ', '사', '랑', '해'};

            for (int cnt=0; cnt<arr.length; cnt++)
                writer.write(arr[cnt]);

            writer.write("\n");
        } catch (IOException ioe) {
            System.out.println("IOE 예외 발생");
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("파일을 닫는 중 오류입니다.");
            }
        }
    }
}
