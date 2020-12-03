package day11_1201.ex06_wrapper;

public class Ex08 {
    public static void main(String[] args) {
        int max = max(args);
        int min = min(args);

        System.out.println(max);
        System.out.println(min);
    }

    private static int max(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int i=1; i<args.length; i++){
            int data = Integer.parseInt(args[i]);
            max = Math.max(max, data);
        }
        return max;
    }

    private static int min(String[] args) {
        int min = Integer.parseInt(args[0]);
        for (int i=1; i<args.length; i++){
            int data = Integer.parseInt(args[i]);
            min = Math.min(min, data);
        }
        return min;
    }
}
