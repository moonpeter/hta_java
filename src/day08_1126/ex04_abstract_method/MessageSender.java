package day08_1126.ex04_abstract_method;

abstract class MessageSender {
    String title;           //제목
    String senderName;      //발송자이름

    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }

    abstract void sendMessage(String recipient);
}
