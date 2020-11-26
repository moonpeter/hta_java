package day08_1126.ex08_Interface;

interface Lendable {

    final static byte STATE_BORROWED = 1;
    final static byte STATE_NORMAL = 0;

    //대출한다.
    public abstract void checkOut(String borrower, String date);

    //반납한다.
    public abstract void checkIn();
}
