package day07_1125.ex01_static_field;

public class Accumulator {
    int total = 0;
    static int grandTotal = 0;

    void accumulate(int amount) {
        total += amount;

        grandTotal += amount;
    }
}
