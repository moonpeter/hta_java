package day09_1124.GoodStock;

public class ClassEx01 {
    public static void main(String args[]) {
        GoodsStock obj;                 // 변수 선언
        obj = new GoodsStock();         // 객체 생성
//        GoodsStock obj = new GoodsStock();

        obj.goodsCode = "52134";        // 필드에 값을 대입
        obj.stockNum = 200;             // 필드에 값을 대입
        System.out.println("상품코드 : " + obj.goodsCode);
        System.out.println("재고수량 : " + obj.stockNum);

        obj.addStock(1000);     // 메서드 호출
        System.out.println("\n===obj.addStock(1000) after ===");
        System.out.println("상품코드 : " + obj.goodsCode);
        System.out.println("재고수량 : " + obj.stockNum);

        obj.subtractStock(500); // 메서드 호출
        System.out.println("\n===obj.subtractStock(500) after ===");
        System.out.println("상품코드 : " + obj.goodsCode);
        System.out.println("재고수량 : " + obj.stockNum);
    }
}
