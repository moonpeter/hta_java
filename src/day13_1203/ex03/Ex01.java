package day13_1203.ex03;

public class Ex01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
