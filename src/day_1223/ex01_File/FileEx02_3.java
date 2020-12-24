package day_1223.ex01_File;

import java.io.File;
import java.io.IOException;

public class FileEx02_3 {
    public static void main(String[] args) {
        String dir = "/Users/moonpeter/newDirectory/newFile.txt";

        File f3 = new File(dir);
        if(f3.exists()) {
            if(f3.delete()) {
                System.out.println(f3.getPath() + " Deledted!!!");
            } else {
                System.out.println(f3.getPath() + "Can't delete!!!!");
            }
        } else {
            System.out.println(f3.getPath() + "Don't exist file!!!");
        }
    }
}
