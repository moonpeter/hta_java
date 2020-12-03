package day13_1203.ex03;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member2 {
    public String name;
    public int age;

    public Member2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return (name+age).hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null || obj instanceof Member2) {
            Member2 member = (Member2) obj;
            return this.name.equals(name) && (member.age ==age);
        } else {
            return false;
        }
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Set<Member2> set = new HashSet<Member2>();
        set.add(new Member2("홍길동", 30));
        set.add(new Member2("홍길동", 30));
        set.add(new Member2("문경호", 33));
        System.out.println("총 객체수 : " + set.size());
        int i=1;
        Iterator<Member2> iterator = set.iterator();
        while (iterator.hasNext()){
            Member2 str = iterator.next();
            System.out.println(i++ + str.name + str.age);
        }
        System.out.println(set.equals(set));
    }
}


