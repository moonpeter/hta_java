package day10_1125.ex03_static_init;

public class Ex01_2 {
    public static void main(String args[]){
        System.out.println("main 실행 시작");
        Ex01_HundredNumbers h = new Ex01_HundredNumbers();
        Ex01_HundredNumbers h2 = new Ex01_HundredNumbers();

        System.out.println(Ex01_HundredNumbers.arr[35]);
        System.out.println(Ex01_HundredNumbers.arr[27]);
        System.out.println(Ex01_HundredNumbers.arr[63]);
    }
}
