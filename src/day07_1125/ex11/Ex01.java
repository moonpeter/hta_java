package day07_1125.ex11;

public class Ex01 {
    public static void main(String args[]) {
        BonusPointAccount obj = new BonusPointAccount("111", "아무개", 0, 0);

        obj.deposit(10000);
        System.out.println("잔액 : " + obj.balance);
        System.out.println("누적포인트 : " + obj.bonusPoint);
    }
}
