package day_1228.ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CRUD {
    // CRUD:컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
    // C(Create-insert), R(Read-select)
    // U(Update-update), D(Delete-delete)
    static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        for (String m : menus) {
            System.out.println(++i + "." + m);
        }

        System.out.print("조회할 컬럼을 선택하세요>");
        int menu = inputNumber(sc);
    }


    public static int inputNumber(Scanner sc){
        int num = 0;
        try{
            num = sc.nextInt();
        } catch (InputMismatchException ipmme) {
            System.out.println("1~9사이의 숫자를 입력하세요>");
        }
        System.out.println("num = " + num);
        return num;
    }
}