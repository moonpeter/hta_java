package day_1222.ex04_student;

import java.io.*;
import java.util.Scanner;

public class Student_out {
    public static void main(String[] args) throws IOException {
        input_info();
    }

    public static void input_info() throws IOException {
        Scanner sc = new Scanner(System.in);
        String pandan = "";
        String name = "";
        int kor, eng, math;
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream("src/day_1222/ex04_student/student.dat"));
            while (!pandan.equalsIgnoreCase("q")) {
                System.out.println("이름을 입력하세요>");
                name = sc.nextLine();
                System.out.println("국어 점수를 입력하세요>");
                kor = Integer.parseInt(sc.nextLine());
                System.out.println("영어 점수를 입력하세요>");
                eng = Integer.parseInt(sc.nextLine());
                System.out.println("수학 점수를 입력하세요>");
                math = Integer.parseInt(sc.nextLine());

                dos.writeUTF(name);
                dos.writeInt(kor);
                dos.writeInt(eng);
                dos.writeInt(math);
                System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료)");
                pandan = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) dos.close();
                System.out.println("입력 완료");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
