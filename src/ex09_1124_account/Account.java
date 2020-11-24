package ex09_1124_account;

public class Account {

    private String accountNo;
    private String ownerName;
    private int balance;


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


