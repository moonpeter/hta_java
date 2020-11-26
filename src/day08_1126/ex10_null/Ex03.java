package day08_1126.ex10_null;

public class Ex03 {
    public static void main(String[] args) {
        Point obj = null;
//        Point obj = new Point(3, 4);
        if (obj == null) {
            System.out.println("obj 변수가 가리키는 객체가 없습니다.");
            return;
        } else {
            System.out.println("x = " + obj.x);
            System.out.println("y = " + obj.y);
        }
    }
}
