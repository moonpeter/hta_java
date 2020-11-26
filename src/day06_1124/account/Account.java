package day06_1124.account;

public class Account {

    String accountNo;
    String ownerName;
    int balance;


    Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int input) {
        balance += input;
    }

    public int withdraw(int output) {
        if (balance < output) {
            return 0;
        }
        balance -= output;
        return balance;
    }
}


