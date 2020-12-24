package day_1223.ex03_serialization_error;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOuputEx01 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new FileOutputStream("src/day_1223/ex03_serialization_error/output.dat")
            );
            out.writeObject(new GoodsStock("70101", 100));
            out.writeObject(new GoodsStock("70102", 50));
            out.writeObject(new GoodsStock("70103", 200));
            System.out.println("파일로 출력 완료");
        } catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("파일로 출력 불가");
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                System.out.println("파일 닫는 중 오류");
            }
        }
    }
}
