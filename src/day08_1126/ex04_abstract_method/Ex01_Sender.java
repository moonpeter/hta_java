package day08_1126.ex04_abstract_method;

public class Ex01_Sender {
    public static void main(String args[]) {
        EmailSender obj1 = new EmailSender("생일을 축하합니다.", "고객센터", "admin@mail.net", "10% 할인쿠폰이 발생되었습니다.");

        obj1.sendMessage("moonpeter@mail.com");

        SMSSender obj2 = new SMSSender("생일 축하", "고객센터", "02-222-2222", "10% 할인 쿠폰");
        obj2.sendMessage("010-1111-1111");
    }
}
