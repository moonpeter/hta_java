package day11_1201.ex02_object;

public class Ex05_rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 30);
        Rectangle r2 = new Rectangle(10, 30);

        System.out.println(r1);
        System.out.println(r2);
        if(r1.equals(r2)) {
            System.out.println("r1.equals(r2) 같음");
        } else {
            System.out.println("r1.equals(r2) 다름");
        }

        if (r1 == r2) {
            System.out.println("r1 == r2 같음");
        } else{
            System.out.println("r1 == r2 다름");
        }
    }
}
