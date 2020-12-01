package day11_1201.ex01_excpetion;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("some.txt");
        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");
        } finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("파일 닫는 중 오류 발생했습니다.");
            }
        }
//        catch (FileNotFoundException e) {
//            System.out.println("파일을 찾을 수 없습니다.");
//        }
    }
}
