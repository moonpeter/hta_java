package day_1223.ex04_serialization_transient_no;

import java.io.Serializable;

public class GoodsStock implements Serializable {

    private String code;       // 상품 코드
    private int num;           // 재고 수량
    GoodsStock(String code, int num) {
        this.code = code;
        this.num = num;
    }

    void addStock(int num) {
        this.num += num;
    }

    int subtractStock(int num) throws Exception{
        if (this.num < num)
            throw new Exception("재고가 부족합니다.");
        this.num -= num;
        return num;
    }

    public String toString() {
        return "상품코드 : " + code + "\t상품수량 : " + num;
    }

    public static void print(GoodsStock obj) {
        System.out.println("상품코드 : " + obj.num);
        System.out.println("재고수량 : " + obj.code);
    }
}
