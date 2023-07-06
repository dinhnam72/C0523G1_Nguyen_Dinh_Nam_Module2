package giaithuat;

public class Bt1 {
    public static void main(String[] args) {
        for (int hang = -4; hang <= 4; hang++) {
            for (int cot = 1; cot < 11; cot++) {
                if (Math.abs(hang) + cot == 10 || cot - Math.abs(hang) == 1) {
                    System.out.print(5 - Math.abs(hang));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
