package day_1222.ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIntputStreamEx1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("파일명을 Arguments탭에 output1.dat입력해 주세요~");
            return;
        }
        FileInputStream in = null;
        try {
            in = new FileInputStream(args[0]);
            byte arr[] = new byte[16];
            while (true) {
                int num = in.read(arr);
                if(num<0)
                    break;
                for (int cnt=0; cnt<num; cnt++){
                    System.out.printf("%02X ", arr[cnt]);
                }
            }

        }catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        }
        finally {
            try {
                in.close();
                System.out.println("파일을 저장했습니다.");
            }catch (Exception e) {
                System.out.println("파일 저장 중 예외가 발생했습니다.");
            }
        }
    }
}
