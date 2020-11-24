package day09_1124.account;

public class Account2 {

    private String accountNo;
    private String ownerName;
    private int balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    Account2(String accountNo, String ownerName, int balance) {
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


