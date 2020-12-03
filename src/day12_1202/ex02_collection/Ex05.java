package day12_1202.ex02_collection;

import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("포도");
        list.add("딸기");
        list.add("복숭아");
        pArrayList(list);

        System.out.println("===");

        list.add(2, "키위");
        list.add(4, "키위");
        pArrayList(list);

        System.out.println("====");
        list.set(0, "오렌지");
        pArrayList(list);

        System.out.println("====");
        list.remove(1);
        pArrayList(list);

        System.out.println("====");
        list.remove("키위");
        pArrayList(list);

    }

    private static void pArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index = " + i + " 데이터 = " + list.get(i));
        }
    }
}
