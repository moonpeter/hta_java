package day_1222.ex01_FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_gugudan {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/day_1222/ex01_FileReader/gugudan.txt");

            writer.write("[2단]\t[3단]\t[4단]\t[5단]\t[6단]\t[7단]\t[8단]\t[9단]\n");
            for(int i=1; i<=9; i++) {
                for(int j=1; j<9; j++) {
                    writer.write(j+1+ "*" + i + "=" + (j+1)*i + "\t");
                }
                writer.write("\n");
            }

        } catch (IOException ioe) {
            System.out.println("IO Exception 발생");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("파일을 닫는 중 오류입니다.");
            }
        }
    }
}