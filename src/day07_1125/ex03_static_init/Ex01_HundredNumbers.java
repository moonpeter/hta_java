package day07_1125.ex03_static_init;

public class Ex01_HundredNumbers {
    static int arr[];
    Ex01_HundredNumbers() {
        System.out.println("여기는 생성자 입니다.");
    }

    static {
        System.out.println("클래스 초기화 블럭");
        arr = new int[100];

        for (int i=0; i<100; i++){
            arr[i] =i;
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\n클래스 초기화 블럭 끝");
    }

    {
        System.out.println("인스턴스 초기화 블럭");

        System.out.println("인스턴스 초기화 블럭 끝");
    }
}
