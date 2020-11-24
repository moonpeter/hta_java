package ex09_1124_GoodStock;

public class GoodsStock {

    String goodsCode;       // 상품 코드
    int stockNum;           // 재고 수량


    GoodsStock() {
    }

    public void addStock(int input_num) {
        stockNum += input_num;
    }

    public int subtractStock(int input_num) {
        if (input_num > stockNum) {
            stockNum = 0;
        }
        if (input_num <= stockNum) {
            stockNum -= input_num;
        }
        return stockNum;
    }
}
