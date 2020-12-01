package day11_1201.ex05;

public class Ex02_shallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.clone();

        System.out.println(c1);
        System.out.println(c2);

        c1.p.x = 9;
        c1.p.y = 9;
        c1.r = 4;

        System.out.println("변경후");
        System.out.println(c1);
        System.out.println(c2);
    }
}
