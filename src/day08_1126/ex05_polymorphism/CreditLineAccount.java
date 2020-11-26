package day08_1126.ex05_polymorphism;

import day08_1126.ex05_polymorphism.Account;

public class CreditLineAccount extends Account {
    int creditLine;

    CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
        super(accountNo, ownerName, balance);
        this.creditLine = creditLine;
    }

    public int withdraw(int amount) throws Exception {
        if ((balance + this.creditLine) < amount) {
            throw new Exception("인출이 불가합니다.");
        }
        balance -= amount;
        return amount;
    }
}
