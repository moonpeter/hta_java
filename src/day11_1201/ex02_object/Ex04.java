package day11_1201.ex02_object;

import java.util.GregorianCalendar;

public class Ex04 {
    public static void main(String[] args) {
        GregorianCalendar obj1 = new GregorianCalendar(2020, 2, 17);
        GregorianCalendar obj2 = new GregorianCalendar(2020, 2, 17);

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        if(obj1.equals(obj2)){
            System.out.println("ojb1.equals(obj2) : 같음");
        } else {
            System.out.println("ojb1.equals(obj2) : 다름");
        }

        if(obj1 == obj2){
            System.out.println("ojb1.equals(obj2) : 같음");
        } else {
            System.out.println("ojb1.equals(obj2) : 다름");
        }
    }
}
