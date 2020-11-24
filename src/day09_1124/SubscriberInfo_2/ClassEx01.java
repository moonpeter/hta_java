package day09_1124.SubscriberInfo_2;

public class ClassEx01 {
    public static void main(String args[]) {
        SubscriberInfo obj = new SubscriberInfo("유재석", "you", "password");
        SubscriberInfo obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
        SubscriberInfo obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-123-4567", "강남");

        obj1.print(obj1);

        obj1.setAddress("서울시 종로구");
        obj1.setPhoneNo("010-1234-5678");

        System.out.println("흥부 = 주소 및 전화번호 추가\n");

        obj1.print(obj1);

        obj2.print(obj2);
    }
}
