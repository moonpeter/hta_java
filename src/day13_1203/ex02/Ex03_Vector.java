package day13_1203.ex02;

import java.util.Vector;

public class Ex03_Vector {
    public static void main(String[] args){
        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("banana");
        vec.add("oRAMGE");

        String temp;
        for(int i=0; i<vec.size(); i++) {
            temp = vec.get(i);
            System.out.println(temp.toUpperCase());
            System.out.println(temp.toLowerCase());
            System.out.println();
        }
    }
}
