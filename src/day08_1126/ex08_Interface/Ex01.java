package day08_1126.ex08_Interface;

public class Ex01 {
    public static void main(String args[]){
        SeparateVolume obj = new SeparateVolume("863ㅂ", "나무", "베르베르");

        printState(obj);

        obj.checkOut("수지", "2020-11-26");

        printState(obj);
    }

    private static void printState(SeparateVolume obj) {
        System.out.println("===============");
        if( obj.state == Lendable.STATE_NORMAL) {
            System.out.println("대출상태 : 대출가능");
        } else {
            System.out.println("대출상태 : 대출중");
            System.out.println("대출인 : " + obj.borrower);
            System.out.println("대출일 : " + obj.checkOutDate);
        }
        System.out.println("===============");
    }
}
