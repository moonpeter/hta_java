package ex09_1124_GoodStock;

public class GoodStock {

    String goodsCode;
    int stockNum;

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
