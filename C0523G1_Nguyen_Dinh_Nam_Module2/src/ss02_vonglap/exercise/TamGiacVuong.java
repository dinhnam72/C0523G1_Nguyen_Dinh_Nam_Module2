package ss02_vonglap.exercise;

public class TamGiacVuong {
    public static void main(String[] args) {
        for (int hang = 0; hang < 6; hang++) {
            for (int cot = 0; cot <= hang; cot++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
