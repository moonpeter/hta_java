package day10_1125.ex02_static_field;

public class Accumulator {
    int total = 0;
    static int grandTotal = 0;

    void accumulate(int amount) {
        total += amount;
        grandTotal += amount;
    }

    static int getGrandTotal() {
//        total = 5;
//        accumulate(100);
        return grandTotal;
    }
}
