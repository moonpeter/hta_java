package day08_1126.ex04_abstract_method;

public class EmailSender extends MessageSender{
    String email;
    String emailBody;

    EmailSender(String title, String senderName, String email, String emailBody) {
        super(title, senderName);
        this.email = email;
        this.emailBody = emailBody;
    }

    @Override
    void sendMessage(String recipient) {
        System.out.println("===============");
        System.out.println("제목 : " + title);
        System.out.println("발송자 : " + senderName);
        System.out.println("수신자 : " + recipient);
        System.out.println("메일주소 : " + email);
        System.out.println("본문 : " + emailBody);
    }
}
