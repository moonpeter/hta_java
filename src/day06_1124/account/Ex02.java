package day06_1124.account;

public class Ex02 {
    public static void main(String args[]) {
        Account2 obj1 = new Account2("111-222-333", "홍길동", 200);
        printAccount(obj1);

        obj1.deposit(1000);
        printAccount(obj1);

        obj1.withdraw(500);
        printAccount(obj1);

    }

    static void printAccount(Account2 obj) {
        System.out.println("계좌번호 : " + obj.getAccountNo());
        System.out.println("예금주 : " + obj.getOwnerName());
        System.out.println("잔액 : " + obj.getBalance());
        System.out.println();
    }
}
