package day08_1126.ex14;

public class Ex01 {
    public static void main(String[] args) {
        Account obj = new Account("111", "홍길동", 100000);
        if (obj instanceof CheckingAccount) {
            pay((CheckingAccount) obj);
        } else {
            System.out.println("캐스트 할 수 없는 타입입니다.");
        }
    }

    static void pay(CheckingAccount obj) {
        try {
            int amount = obj.pay("555", 47000);
            System.out.println("인출액 : " + amount);
            System.out.println("카드번호 : " + obj.cardNo);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
