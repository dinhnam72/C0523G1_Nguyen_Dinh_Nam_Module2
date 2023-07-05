package ss02_vonglap.exercise;

public class TamGiacVuongNguoc {
    public static void main(String[] args) {
        for (int hang = 4; hang >=0; hang--) {
            for (int cot = 0; cot <=hang ; cot++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
