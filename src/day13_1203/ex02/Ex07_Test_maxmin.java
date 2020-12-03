package day13_1203.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07_Test_maxmin {

    static Map max_min(int[] data){
        Map<String, Integer> m = new HashMap<>();
        int result[] = {data[0], data[0]};
        m.put("max", data[0]);
        m.put("min", data[0]);

        for (int i=0; i<data.length; i++) {
            if(m.get("max") < data[i]) {
                m.put("max", data[i]);
            }
            if(m.get("min") > data[i]) {
                m.put("min", data[i]);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int data[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요>");
        for(int i=0; i<data.length; i++) {
            data[i] = sc.nextInt();
        }
        Map mm = max_min(data);
        System.out.println(mm);
        sc.close();
    }
}
