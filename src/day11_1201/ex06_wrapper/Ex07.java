package day11_1201.ex06_wrapper;

public class Ex07 {
    public static void main(String[] args){
        printDouble(new Double(123.45));

        printDouble(32.2342);
    }

    static void printDouble(Double obj) {
        System.out.println(obj);
        System.out.println(obj.doubleValue());
        System.out.println(obj.toString());
    }
}
