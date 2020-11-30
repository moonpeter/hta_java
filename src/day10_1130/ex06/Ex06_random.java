package day10_1130.ex06;

import java.util.Random;

public class Ex06_random {
    public static void main(String[] args) {
        Random random = new Random();

//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));


        for (int i=0; i<6; i++) {
            System.out.println("1~45 난수 발생 : " + (random.nextInt(45)+1));
        }
    }
}
