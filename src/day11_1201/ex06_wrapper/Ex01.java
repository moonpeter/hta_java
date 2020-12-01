package day11_1201.ex06_wrapper;

public class Ex01 {
    public static void main(String[] args) {
        Integer obj1 = new Integer(12);
        Integer obj2 = new Integer(7);

        int n1 = obj1.intValue();
        int n2 = obj2.intValue();
        int sum = n1 + n2;

        System.out.println(sum);

        Integer n02 = new Integer("20");

        int n3 = n02.intValue();
        sum = n1 + n2 + n3;
        System.out.println(sum);

//        Integer n03 = new Integer("a20");
    }
}
