package day09_1124.GoodStock_2;

public class ClassEx01 {
    public static void main(String args[]) {
        GoodsStock obj = new GoodsStock("52134", 200);

        obj.print(obj);

        obj.addStock(1000);     // 메서드 호출
        System.out.println("\n===obj.addStock(1000) after ===");
        obj.print(obj);

        obj.subtractStock(500); // 메서드 호출
        System.out.println("\n===obj.subtractStock(500) after ===");
        obj.print(obj);
    }
}
