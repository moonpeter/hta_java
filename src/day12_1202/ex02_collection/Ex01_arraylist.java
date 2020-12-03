package day12_1202.ex02_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        int num = 123;


        list2.add("123123");
        list2.add("33333");

        list.add("하나");
        list.add(2);
        list.add(false);
        list.add(3.42);
        list.add("넷");
        list.add("five");
        list.add('A');
        list.add(list2);

        list.add(num);

        System.out.println(list);
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.get(1));

        int n = (Integer) list.get(1);
        System.out.println(n);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("\n===");
        for (int i = 0; i<list.size(); i++) {
            Object s = list.get(i);
            System.out.print(s);
        }
        System.out.println("\n===");

        System.out.println("향상된 for문");
        for(Object a: list){
            System.out.print(a);
        }

        System.out.println("\n===Iterator 인터페이스 사용");
        Iterator elements = list.iterator();
        while (elements.hasNext()){
            System.out.print(elements.next());
        }
    }
}
