package day10_1125.ex06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04_Exception {
    public static void main(String args[]){
        FileReader reader = null;
        try {
            reader = new FileReader("some.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
