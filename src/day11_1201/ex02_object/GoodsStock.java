package day11_1201.ex02_object;

public class GoodsStock {
    String stockNo;
    int amount;

    GoodsStock(String stockNo, int amount) {
        this.stockNo = stockNo;
        this.amount = amount;
    }

    public String toString() {
        return "상품수량 : " + stockNo + " 재고수량 : " + amount;
    }
}
