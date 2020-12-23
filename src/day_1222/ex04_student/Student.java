package day_1222.ex04_student;

public class Student {
    private String name;
    private int  kor, eng,  math;
    private static int korTotal, engTotal, mathTotal;
    Student(String name,int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        //Student 생성때 마다 과목별 총점 구합니다.
        korTotal += kor;
        engTotal += eng;
        mathTotal += math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage(){
        return (getTotal() / 3f);
    }

    public String getName() {
        return name;
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

    public static int getKorTotal() {
        return korTotal;
    }

    public static void setKorTotal(int korTotal) {
        Student.korTotal = korTotal;
    }

    public static int getEngTotal() {
        return engTotal;
    }

    public static void setEngTotal(int engTotal) {
        Student.engTotal = engTotal;
    }

    public static int getMathTotal() {
        return mathTotal;
    }

    public static void setMathTotal(int mathTotal) {
        Student.mathTotal = mathTotal;
    }


}

