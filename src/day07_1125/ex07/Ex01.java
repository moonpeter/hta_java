package day07_1125.ex07;

public class Ex01 {
    public static void main(String args[]) {
        CheckingAccount ac = new CheckingAccount();
        ac.accountNo = "111-111-111";
        ac.ownerName = "홍길동";
        ac.cardNo = "222-222-222";

        ac.deposit(100000);
        try {
            int paidAmount = ac.pay("222-222-222", 4700);
        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
