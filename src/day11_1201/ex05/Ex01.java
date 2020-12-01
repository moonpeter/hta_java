package day11_1201.ex05;

public class Ex01 {
    public static void main(String[] args) {
        Point obj1 = new Point(3, 5);
        Circle obj2 = new Circle(obj1, 2);

        System.out.println(obj2.toString());
    }
}
