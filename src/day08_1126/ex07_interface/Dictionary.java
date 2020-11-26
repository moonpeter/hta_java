package day08_1126.ex07_interface;

public class Dictionary implements Lendable {
    String title;

    Dictionary(String title) {
        this.title = title;
    }

    @Override
    public void checkOut(String borrower, String date) {

    }

    @Override
    public void checkIn() {

    }
}
