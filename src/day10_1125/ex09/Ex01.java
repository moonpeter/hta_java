package day10_1125.ex09;

public class Ex01 {
    public static void main(String args[]) {
        CheckingAccount obj = new CheckingAccount("111", "홍길동", 0, "222");

        obj.deposit(1000000);
        try {
            int paidAmount = obj.pay("222", 47000);
            System.out.println("지불액 : " + paidAmount);
            System.out.println("잔액 : " + obj.balance);
        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
