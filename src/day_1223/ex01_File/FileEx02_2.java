package day_1223.ex01_File;

import java.io.File;
import java.io.IOException;

public class FileEx02_2 {
    public static void main(String[] args) {
        String dir = "/Users/moonpeter/newDirectory";

        File f2 = new File(dir);
        if(!f2.exists()) {
            if(f2.mkdir()) {
                System.out.println("새로 만든 디렉토리 이름 : " + f2.getPath());
            } else {
                System.out.println("디렉토리 생성에 실패했습니다.");
            }
        } else {
            System.out.println("이미 있는 디렉토리 이름 : " + f2.getPath());
        }

        File f = new File(dir+"/newFile.txt");

        if(f.exists()) {
            System.out.println(f.getPath() + "경로에" + f.getName() + "파일이 있습니다.");
        } else {
            try {
                if(f.createNewFile()){
                    System.out.println(f.getPath() + "에 새로운 파일을 만들었습니다.");
                }
            }catch (IOException e) {
                System.out.println("IOException 발생했습니다.");
            }
        }
    }
}
