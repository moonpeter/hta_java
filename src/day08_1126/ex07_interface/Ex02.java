package day08_1126.ex07_interface;

public class Ex02 {
    public static void main(String args[]) {
        Lendable arr0, arr1, arr2;

        arr0 = new SeparateVolume("883o", "푸코의 진자", "에코");
        arr1 = new SeparateVolume("609.2", "서양미술사", "곰브리치");
        arr2 = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");

        checkOut(arr0, "수지", "2020-11-26");
        checkOut(arr1, "수지", "2020-11-26");
        checkOut(arr2, "수지", "2020-11-26");
    }

    static void checkOut(Lendable arr, String borrower, String date) {
        arr.checkOut(borrower, date);
    }

}
