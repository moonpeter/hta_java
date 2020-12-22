package day_1222.ex01_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/moonpeter/eclipse-workspace/hta_java/src/day_1222/ex01_FileReader/poem.txt");
            while (true) {
                int data = reader.read();
                if (data == -1)
                    break;
                char ch = (char) data;
                System.out.print(ch);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ioe) {
            System.out.println("파일을 읽을수 없습니다.");
        } catch (NullPointerException n) {
            System.out.println("NullPointerException 예외 발생");
        }
        finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
}
