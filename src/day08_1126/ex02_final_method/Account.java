package day08_1126.ex02_final_method;

public class Account {

    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo, String ownerName, int balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    //final 키워드를 이용한 메소드 오버라이딩 금지
    int withdraw(int amount) throws Exception {
        if (balance < amount) {
            throw new Exception("잔액이 부족합니다.");
        }
        balance -= amount;
        return amount;
    }
}


