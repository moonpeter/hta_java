package day_1222.test_jumsu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        input();
    }

    private static void input() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/day_1222/test_jumsu/jumsu.txt"));
            ArrayList<Student> list = new ArrayList<Student>();
            while (true) {
                String str = reader.readLine();
                if (str == null)
                    break;
                String[] sep = str.split(" ");
                list.add(new Student(sep[0], Integer.parseInt(sep[1]), Integer.parseInt(sep[2]), Integer.parseInt(sep[3])));
            }
            print(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try { reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void print(ArrayList<Student> list) {
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

        for (Student s : list) {
            System.out.print(s.getName() + "\t" + s.getKor() + "\t" + s.getEng()+ "\t" + s.getMath()+ "\t" + s.getTotal() + "\t");
            System.out.printf("%.1f\n", s.getAverage());
        }

        for (int j = 0; j<45; j++) {
            System.out.print("=");
        }

        System.out.print("\n총점\t");
        System.out.print(day_1222.ex04_student.Student.getKorTotal() + "\t");
        System.out.print(day_1222.ex04_student.Student.getEngTotal() + "\t");
        System.out.print(day_1222.ex04_student.Student.getMathTotal());

    }
}
