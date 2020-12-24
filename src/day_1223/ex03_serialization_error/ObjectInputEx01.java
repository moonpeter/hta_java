package day_1223.ex03_serialization_error;

import java.io.*;

public class ObjectInputEx01 {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("src/day_1223/ex03_serialization_error/output.dat"));
            while (true) {
                GoodsStock obj = (GoodsStock) in.readObject();
                System.out.println(obj.toString());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (EOFException e) {
            e.printStackTrace();
            System.out.println("끝");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
