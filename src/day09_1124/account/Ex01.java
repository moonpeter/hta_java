package day09_1124.account;

public class Ex01 {
    public static void main(String args[]) {
        Account obj1 = new Account("111-222-333", "홍길동", 200);
        printAccount(obj1);

        obj1.deposit(1000);
        printAccount(obj1);

        obj1.withdraw(500);
        printAccount(obj1);

    }

    static void printAccount(Account obj) {
        System.out.println("계좌번호 : " + obj.accountNo);
        System.out.println("예금주 : " + obj.ownerName);
        System.out.println("잔액 : " + obj.balance);
        System.out.println();
    }
}
