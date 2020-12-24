package day_1223.ex01_File;

import java.io.File;

public class FileEx02_4 {
    public static void main(String[] args) {

        File f4 = new File("/Users/moonpeter/newDirectory");
        if(f4.exists()) {
            if(f4.delete()) {
                System.out.println(f4.getPath() + " Deledted!!!");
            } else {
                System.out.println(f4.getPath() + "Can't delete!!!!");
            }
        } else {
            System.out.println(f4.getPath() + "Don't exist directory!!!");
        }
    }
}
