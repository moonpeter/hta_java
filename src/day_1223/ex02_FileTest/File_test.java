package day_1223.ex02_FileTest;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_test {
    public static void main(String[] args) {
        String originaldir = "/Users/moonpeter/test";
        String targetdir = "/Users/moonpeter/temp";
        String originalFileName = "koala.jpg";
        String targetFilename = "koala_copy.jpg";
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream(originaldir + "/" + originalFileName));

            File to = new File(targetdir);
            if(!to.exists()) {
                if(to.mkdir()) {
                    System.out.println("mkdir dir!!!");
                }
            }
            out = new BufferedOutputStream(new FileOutputStream(targetdir + "/" + targetFilename));

            int readCount;
            byte[] readBytes = new byte[1024];
            while ((readCount = in.read(readBytes)) !=-1) {
                out.write(readBytes);
            }
            System.out.println("Copy!!!!!!!!");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        } finally {
            try {
                if (in !=null)
                    in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(out!=null)
                    out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
