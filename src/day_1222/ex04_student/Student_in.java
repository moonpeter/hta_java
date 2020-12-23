package day_1222.ex04_student;

import java.io.*;
import java.util.ArrayList;

public class Student_in {
    public static void main(String args[]) {
        input();
    }

    private static void input() {
        String name = "";
        int kor, eng, math;
        DataInputStream dis = null;
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            dis = new DataInputStream(
                    new FileInputStream("src/day_1222/ex04_student/student.dat"));
            while (true) {
                name = dis.readUTF();
                kor = dis.readInt();
                eng = dis.readInt();
                math = dis.readInt();
                list.add(new Student(name, kor, eng, math));
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일 존재 X");
        } catch (EOFException eofe) {
            print(list);
        } catch (IOException ioe) {
            System.out.println("파일을 읽을 수 없습니다.");
        } finally {
            try {
                if (dis != null)
                    dis.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void print(ArrayList<Student> list) {
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

        for (Student s : list) {
            System.out.print(s.getName() + "\t" + s.getKor() + "\t" + s.getEng()+ "\t" + s.getMath()+ "\t" + s.getTotal() + "\t");
            System.out.printf("%.1f\n", s.getAverage());
        }

        for (int j = 0; j<45; j++) {
            System.out.print("=");
        }

        System.out.print("\n총점\t");
        System.out.print(Student.getKorTotal() + "\t");
        System.out.print(Student.getEngTotal() + "\t");
        System.out.print(Student.getMathTotal());

    }
}
