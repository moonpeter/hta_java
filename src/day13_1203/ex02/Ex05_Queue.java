package day13_1203.ex02;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("비었나요? " + queue.isEmpty());

        queue.add("토끼");
        queue.add("사슴");
        queue.add("호랑이");

        System.out.println(queue.peek());
        System.out.println("비었나요? " + queue.isEmpty());
        System.out.println("갯수 : " + queue.size());

        System.out.println("poll() 사용");
        while (!queue.isEmpty()) {
            String str = queue.poll();
            System.out.println(str);
        }
        System.out.println("비었나요? " + queue.isEmpty());
    }
}
