package day11_1201.ex05;

public class Ex03 {
    public static void main(String[] args) {
        Point p = new Point(5, 10);

        Class c1 = p.getClass();

        Class c2 = Point.class;

        Class c3 = null;

        try {
            c3 = Class.forName("day11_1201.ex05.Point");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();;
        }

        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
