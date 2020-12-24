package day_1223.ex01_File;

import java.io.File;

public class FileEx02 {
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
    }
}