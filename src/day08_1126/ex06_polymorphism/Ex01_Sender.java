package day08_1126.ex06_polymorphism;

import day08_1126.ex06_polymorphism.EmailSender;

public class Ex01_Sender {
    public static void main(String args[]) {
        EmailSender obj1 = new EmailSender("생일을 축하합니다.", "고객센터", "admin@mail.net", "10% 할인쿠폰이 발생되었습니다.");

//        obj1.sendMessage("moonpeter@mail.com");

        SMSSender obj2 = new SMSSender("생일 축하", "고객센터", "02-222-2222", "10% 할인 쿠폰");
//        obj2.sendMessage("010-1111-1111");

        send(obj1, "test@mail.com");
        send(obj1, "test2@mail2.com");
        send(obj2, "010-000-0000");

    }

    static void send(MessageSender obj, String recipient) {
        obj.sendMessage(recipient);
    }

}
