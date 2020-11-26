package day07_1125.ex02_static_field;

public class Ex01_Accumulator {
    public static void main(String args[]){
        System.out.println("정적 변수 grandTotal = " + Accumulator.grandTotal);

        Accumulator obj1 = new Accumulator();
        Accumulator obj2 = new Accumulator();

        obj1.accumulate(10);
        obj2.accumulate(20);

        int grandTotal = Accumulator.getGrandTotal();

        print(obj1);
        print(obj2);
        System.out.println("총계 = " + grandTotal);
    }

    static void print(Accumulator obj) {
        System.out.println("total = " + obj.total);
    }
}
