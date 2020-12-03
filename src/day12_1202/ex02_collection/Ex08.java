package day12_1202.ex02_collection;

import java.util.ArrayList;

public class Ex08 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("봄");
        list1.add("여름");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("봄"); list2.add("봄"); list2.add("여름"); list2.add("가을"); list2.add("겨울");

        System.out.println(list1);
        System.out.println(list2);

        if(list1.contains("봄")) {
            System.out.println("봄이 존재합니다.");
        } else {
            System.out.println("봄이 존재하지 않습니다.");
        }

        for(int i=0; i<list2.size(); i++) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
                i--;
                System.out.println(list2);
            }
        }
    }
}
