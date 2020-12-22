package day_1221.ex10_syn_format1;

public class SharedArea {
    private Account account1; // 이몽룡
    private Account account2; // 성춘향

    SharedArea(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    void transfer() {   // 계좌 이체를 한다
        synchronized (this) {   // this: 동기화 할 객체가 자기 자신입니다.
            account1.withdraw(1000000);
            account2.deposit(1000000);
        }// 동기화 끝
    }
    int getTotal() {
        synchronized (this) {   // 잔액 합계를 구한다.
            return account1.getBalance() + account2.getBalance();
        }   // 동기화
    }

    public Account getAccount1() {
        return account1;
    }

    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    public Account getAccount2() {
        return account2;
    }

    public void setAccount2(Account account2) {
        this.account2 = account2;
    }
}

