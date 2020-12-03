package day12_1202.ex01_student2;

public class Student2 {
    private int no;
    private String name;
    private int kor, eng, math;
    private int total;
    public static int korTotal;
    public static int engTotal;
    public static int mathTotal;

    public Student2(String name, int kor, int eng, int math, int no) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.no = no;
        korTotal += kor;
        engTotal += eng;
        mathTotal += math;
    }

    public int getNo() {
        return no;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public static void sort(Student2[] hs) {
        Student2 imsi;
        for (int i = 0; i < hs.length - 1; i++) {
            for (int j = 0; j < hs.length - 1 - i; j++) {
                if (hs[j].total < hs[j + 1].total) {
                    imsi = hs[j];
                    hs[j] = hs[j + 1];
                    hs[j + 1] = imsi;
                }
            }
        }
    }

    public String toString() {
        return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
                + total + "\t" + String.format("%.1f", total / 3f);
    }

}
