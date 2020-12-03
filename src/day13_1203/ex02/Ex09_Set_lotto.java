package day13_1203.ex02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex09_Set_lotto {
    public static void main(String[] args) {
        Set result = make();
        System.out.println(result);
    }

    private static Set make() {
        Set num = new TreeSet<>();
        while (num.size() < 6) {
            num.add((int) (Math.random() * 45 + 1));
        }
        return num;
    }
}