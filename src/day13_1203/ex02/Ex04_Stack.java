package day13_1203.ex02;

import java.util.Stack;

public class Ex04_Stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println("비었나요? " + s.empty());

        s.push("좋아요");
        s.push("Java");
        s.push("좋아요");
        s.push("자바");
        s.push("좋아요");
        s.push("JAVA");
        System.out.println("비었나요? " + s.empty());


        System.out.println("맨 마지막 데이터 : " + s.peek());
        System.out.println("========");

        while (!s.empty()){
            System.out.println("데이터 출력 : " + s.pop());
            System.out.println("남은 데이터 갯수 : " + s.size());
        }
        System.out.println("=======");
        System.out.println("비었나요? " + s.empty());

    }
}
