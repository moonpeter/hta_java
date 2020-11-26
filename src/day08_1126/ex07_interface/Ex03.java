package day08_1126.ex07_interface;

import java.util.Objects;

public class Ex03 {
    public static void main(String args[]) {
        Lendable arr[] = new Lendable[3];

        arr[0] = new SeparateVolume("883o", "푸코의 진자", "에코");
        arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
        arr[2] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");


        for (int i=0; i<arr.length; i++){
            checkOut(arr[i], "수지", "2020-11-26");
        }
    }

    static void checkOut(Lendable arr, String borrower, String date) {
        arr.checkOut(borrower, date);
    }

}
