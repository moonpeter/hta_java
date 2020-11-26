package day06_1124.SubscriberInfo_2;

public class SubscriberInfo {

    String name, id, password;
    String phoneNo, address;

    SubscriberInfo(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
        this(name, id, password);
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(SubscriberInfo obj) {
        System.out.println("이름:" + obj.name);
        System.out.println("아이디:" + obj.id);
        System.out.println("패스워드:" + obj.password);
        System.out.println("전화번호:" + obj.phoneNo);
        System.out.println("주소:" + obj.address);
        System.out.println("===============\n");
    }
}
