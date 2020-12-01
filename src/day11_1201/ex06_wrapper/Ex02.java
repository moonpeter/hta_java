package day11_1201.ex06_wrapper;

public class Ex02 {
    public static void main(String[] args) {
        int total = 0;
        int total_2 = 0;
        for (int cnt = 0; cnt < args.length; cnt++) {

            Integer obj = new Integer(args[cnt]);
            total += obj.intValue();

            total_2 = Integer.parseInt(args[cnt]) + total_2;
         }
//        for (String arg : args) {
//            total = Integer.parseInt(arg) + total;
//        }

        System.out.println(total);
        System.out.println(total_2);
    }
}
