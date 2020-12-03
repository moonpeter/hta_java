package day12_1202.ex02_collection;

import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("포도");
        list.add("딸기");
        list.add("복숭아");

        int num = list.size();

        for (int i=0; i<num; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("===향상된 for문");
        for(String str : list){
            System.out.println(str);
        }
    }
}
