package day13_1203.ex02;

import java.util.LinkedList;

public class Ex01_LinkedList_add {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("포도");
        list.add("딸기");
        list.add("복숭아");
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
    }
}
