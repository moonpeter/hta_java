package day07_1125.ex07;

public class CheckingAccount extends Account{
    String cardNo;

    public int pay(String cardNo, int amount) throws Exception{
        if (!cardNo.equals(this.cardNo) || amount > balance) {
            throw new Exception("지불이 불가능합니다.");
        }
        return withdraw(amount);
    }
}