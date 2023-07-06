package giaithuat;

public class Bt1 {
    public static void main(String[] args) {
        for (int i = -4; i <= 4; i++) {
            for (int j = 1; j < 11; j++) {
                if (Math.abs(i) + j == 10 || j - Math.abs(i) == 1) {
                    System.out.print(5 - Math.abs(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
