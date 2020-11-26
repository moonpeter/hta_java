package day06_1124.GoodStock_2;

public class GoodsStock {

    String goodsCode;       // 상품 코드
    int stockNum;           // 재고 수량


    GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
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
    public static void print(GoodsStock obj) {
        System.out.println("상품코드 : " + obj.stockNum);
        System.out.println("재고수량 : " + obj.goodsCode);
    }
}
