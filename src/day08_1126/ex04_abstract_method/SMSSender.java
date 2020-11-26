package day08_1126.ex04_abstract_method;

class SMSSender extends MessageSender{
    String returnPhoneNo;
    String message;

    SMSSender(String title, String senderName, String returnPhoneNo, String message) {
        super(title, senderName);
        this.returnPhoneNo = returnPhoneNo;
        this.message = message;
    }

    @Override
    void sendMessage(String recipient) {
        System.out.println("===============");
        System.out.println("제목 : " + title);
        System.out.println("발송자 : " + senderName);
        System.out.println("수신자 : " + recipient);
        System.out.println("전화번호 : " + returnPhoneNo);
        System.out.println("본문 : " + message);
    }
}
