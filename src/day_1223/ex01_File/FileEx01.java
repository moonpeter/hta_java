package day_1223.ex01_File;

import java.io.File;
import java.util.GregorianCalendar;

public class FileEx01 {
    public static void main(String[] args) {
        // 상위 디렉토리 경로명을 가지고 File 객체를 생성
        File file = new File(".");
        File arr[] = file.listFiles(); // 서브 디렉토리와 파일 목록을 가져옴

        for (int cnt = 0; cnt < arr.length; cnt++) {
            String name = arr[cnt].getName(); //이름을 리턴

            if (arr[cnt].isFile())
                System.out.printf("%-25s %7d \t", name, arr[cnt].length());

            else
                System.out.printf("%-25s    <DIR> \t", name);

            long time = arr[cnt].lastModified();

            GregorianCalendar calendar = new GregorianCalendar();

            calendar.setTimeInMillis(time);

            System.out.printf("%1$tF %1$tT \n", calendar);

        }
    }
}
