package day06_1124.field_test;

public class FieldEx01 {
    public static void main(String[] args) {
        Nemo obj = new Nemo(5, 6);
        double area = obj.getArea();

        System.out.println("네모의 가로 = " +obj.garo);
        System.out.println("네모의 세로 = " +obj.sero);
        System.out.println("네모의 넓이 = " + area);
    }
}
