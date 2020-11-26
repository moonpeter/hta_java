package day08_1126.ex14;

public class CheckingAccount extends Account {
    String cardNo;

    CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
        super(accountNo, ownerName, balance);
        this.cardNo = cardNo;           // 클래스 안에 선언된 필드 초기화
    }

    public int pay(String cardNo, int amount) throws Exception{
        if (!cardNo.equals(this.cardNo) || amount > balance) {
            throw new Exception("지불이 불가능합니다.");
        }
        return withdraw(amount);
    }
}