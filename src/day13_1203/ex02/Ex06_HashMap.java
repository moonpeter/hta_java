package day13_1203.ex02;

import java.util.HashMap;
import java.util.Set;

public class Ex06_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("woman", "재미있니");
        hm.put("man", "좋은하루");
        hm.put("age", new String("10"));
        hm.put("city", "Seoul");
        hm.put("city", "Busan");

        System.out.println(hm);

        System.out.println(hm.keySet());

        System.out.println(hm.values());

        System.out.println(hm.get("woman"));
        System.out.println(hm.get("city"));

        System.out.println("================");
        Set<String> keys = hm.keySet();
        for (String key: keys) {
            System.out.println(key + " = " + hm.get(key));
        }

    }
}
