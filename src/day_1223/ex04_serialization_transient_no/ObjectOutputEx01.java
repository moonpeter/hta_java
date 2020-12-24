package day_1223.ex04_serialization_transient_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputEx01 {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
            BBSItem obj = new BBSItem("홍길동", "sunshine", "모임은 다음에", "집에서 할 수 있는 취미", new GoodsStock("7001", 1000));
            System.out.println(obj);
            out.writeObject(obj);
        } catch (IOException ioe) {
            System.out.println("파일로 출력 불가");
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
