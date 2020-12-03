package day13_1203.ex02;

import java.util.HashSet;
import java.util.Iterator;

public class Ex08_Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("자바");
        set.add("카푸치노");
        set.add("에스프레소");
        set.add("자바");
        System.out.println("저장된 데이터의 수 : " + set.size());

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
