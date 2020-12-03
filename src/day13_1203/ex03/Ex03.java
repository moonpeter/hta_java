package day13_1203.ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        set.add(new Member("문경호", 33));
        System.out.println("총 객체수 : " + set.size());
        int i=1;
        Iterator<Member> iterator = set.iterator();
        while (iterator.hasNext()){
            Member str = iterator.next();
            System.out.println(i++ + str.name + str.age);
        }
    }
}


