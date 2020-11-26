package day08_1126.ex14;

public class Account {

    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo, String ownerName, int balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int withdraw(int amount) throws Exception {
        if (balance < amount) {
            throw new Exception("잔액이 부족합니다.");
        }
        balance -= amount;
        return amount;
    }
}


