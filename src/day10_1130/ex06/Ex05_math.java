package day10_1130.ex06;

public class Ex05_math {
    public static void main(String[] args) {
        int[] num = make();
        sortAsc(num);
        System.out.println("=============");
        print(num);
    }

    private static int[] make() {
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 45 + 1);
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }
        return num;
    }

    private static int[] sortAsc(int[] num) {
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num.length-1; j++){
                if(num[i] < num[j]) {
                    int imsi = num[i];
                    num[i] = num[j];
                    num[j] = imsi;
                }
            }
        }
        return num;
    }

    private static void print(int[] num) {
        for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
