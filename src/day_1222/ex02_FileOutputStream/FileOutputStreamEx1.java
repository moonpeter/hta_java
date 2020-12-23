package day_1222.ex02_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("src/day_1222/ex02_FileOutputStream/output1.dat");
            byte arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            for (int cnt=0; cnt<arr.length; cnt++){
                out.write(arr[cnt]);
            }
        }catch (FileNotFoundException fnfe) {
            System.out.println(args[0] + "파일로 출력할 수 없습니다.");
        }catch (IOException ioe) {
            System.out.println("파일을 읽을수 없습니다.");
        }
        finally {
            try {
                out.close();
                System.out.println("파일을 저장했습니다.");
            }catch (Exception e) {
                System.out.println("파일 저장 중 예외가 발생했습니다.");
            }
        }
    }
}
