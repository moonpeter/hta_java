package day13_1203.ex02;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex02_LinkedList_add {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("포도");
        list.add("딸기");
        list.add("복숭아");
        list.add(2, "키위");

        pLinkedList(list);

        list.set(0, "오랜지");
        pLinkedList(list);

        list.remove(1);
        pLinkedList(list);

        list.remove("키위");
        pLinkedList(list);


    }

    static void pLinkedList(LinkedList list) {
        System.out.println("=======");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
