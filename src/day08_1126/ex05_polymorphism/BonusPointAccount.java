package day08_1126.ex05_polymorphism;

import day08_1126.ex05_polymorphism.Account;

public class BonusPointAccount extends Account {
    int bonusPoint;

    BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
        super(accountNo, ownerName, balance);
        this.bonusPoint = bonusPoint;
    }

    public void deposit(int amount) {
        bonusPoint += amount / 1000;
        balance += amount;
    }
}
