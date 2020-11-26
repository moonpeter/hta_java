package day08_1126.ex05_polymorphism;

import java.util.Objects;

public class Ex01 {
    public static void main(String args[]) {
        Account obj1 = new Account("111-111", "임꺽정", 10000);

        CheckingAccount obj2 = new CheckingAccount("222-222", "홍길동", 20000, "222-card");

        CreditLineAccount obj3 = new CreditLineAccount("333-333", "김선달", 30000, 2000000);

        BonusPointAccount obj4 = new BonusPointAccount("444-444", "김미영", 0, 0);

        printAccountInfo(obj1);
        printAccountInfo(obj2);
        printAccountInfo(obj3);
        printAccountInfo(obj4);
    }

    static void printAccountInfo(Account obj) {
        System.out.println("걔좌번호 : " + obj.accountNo + " / 예금주 이름 : " + obj.ownerName + " / 잔액 : " + obj.balance);
    }
}
