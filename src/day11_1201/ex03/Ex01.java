package day11_1201.ex03;

public class Ex01 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(10, 20);

        Rectangle obj2 = (Rectangle) obj1.clone();

        System.out.println(obj1.width + obj1.height);
        System.out.println(obj2.width + obj2.height);
        System.out.println("obj1.height=100; obj1.width=200;");
        obj1.height = 100;
        obj1.width = 200;
        System.out.println(obj1.width + obj1.height);
        System.out.println(obj2.width + obj2.height);
    }
}
